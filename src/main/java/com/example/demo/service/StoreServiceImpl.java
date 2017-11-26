package com.example.demo.service;

import static com.example.demo.mapper.StoreMapper.mapToLocationDTO;
import static com.example.demo.util.CalculateDistance.distanceTo;
import static com.example.demo.util.LocationTool.getGeometry;
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

import com.example.demo.datatransferobject.StoresDTO;
import com.example.demo.domainobject.LocationDO;
import com.example.demo.repository.LocationRepository;
import com.google.maps.model.Geometry;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void addStores(List<LocationDO> storeLocations) {
		locationRepository.save(storeLocations);
	}

	@Override
	public StoresDTO findStores(String location) throws StoreException {
		Geometry loc;

		try {
			loc = getGeometry(location);
		} catch (Exception e) {
			throw new StoreException(e.getMessage());
		}

		List<LocationDO> stores = Optional.ofNullable(locationRepository.findAll()).orElse(emptyList());

		Map<Double, LocationDO> distanceToStoreMap = new TreeMap<>();

		stores.stream().forEach(store -> distanceToStoreMap.put(distanceTo(loc, store), store));

		List<Map.Entry<Double, LocationDO>> locations = distanceToStoreMap.entrySet().stream()
				.sorted(comparing(Entry::getKey, reverseOrder()))
				.limit(5)
				.collect(toList());

		return new StoresDTO(locations.stream().map(locationStore -> mapToLocationDTO(locationStore.getValue())).collect(toList()));
	}

}
