package com.jumbo.service;

import static com.jumbo.mapper.StoreLocationMapper.mapToLocationDTO;
import static com.jumbo.util.CalculateDistance.distanceTo;
import static com.jumbo.util.LocationTool.getGeometry;
import static java.util.Collections.emptyList;
import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.maps.model.Geometry;
import com.jumbo.datatransferobject.StoresDTO;
import com.jumbo.domainobject.LocationDO;
import com.jumbo.exception.LocationSearchException;
import com.jumbo.mapper.StoreLocationMapper;
import com.jumbo.repository.StoreLocationRepository;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreLocationRepository storeLocationRepository;

	@Override
	public void addStores(List<LocationDO> storeLocations) {
		storeLocationRepository.save(storeLocations);
	}

	@Override
	public StoresDTO findStores(String location, long noOfStores) throws LocationSearchException {
		Geometry loc;

		try {
			loc = getGeometry(location);
		} catch (Exception e) {
			throw new LocationSearchException(e.getMessage());
		}

		List<LocationDO> stores = Optional.ofNullable(storeLocationRepository.findAll()).orElse(emptyList());

		Map<Double, LocationDO> distanceToStoreMap = new TreeMap<>();

		stores.stream().forEach(store -> distanceToStoreMap.put(distanceTo(loc, store), store));

		List<Map.Entry<Double, LocationDO>> locations = distanceToStoreMap.entrySet().stream()
				.sorted(comparing(Entry::getKey, reverseOrder()))
				.limit(noOfStores)
				.collect(toList());

		return new StoresDTO(locations.stream().map(locationStore -> mapToLocationDTO(locationStore.getValue())).collect(toList()));
	}

	@Override
	public StoresDTO getAllStores() {
		return new StoresDTO(Optional.ofNullable(storeLocationRepository.findAll()).orElse(emptyList()).stream()
				.map(StoreLocationMapper::mapToLocationDTO)
				.collect(toList()));
	}

}
