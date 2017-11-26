package com.example.demo.mapper;

import com.example.demo.datatransferobject.LocationDTO;
import com.example.demo.domainobject.LocationDO;

public class StoreMapper {

	public static LocationDO mapToLocationDO(LocationDTO locationDTO) {
		LocationDO locationDO = new LocationDO();
		locationDO.setAddressName(locationDTO.getAddressName());
		locationDO.setCity(locationDTO.getCity());
		locationDO.setComplexNumber(locationDTO.getComplexNumber());
		locationDO.setLatitude(locationDTO.getLatitude());
		locationDO.setLongitude(locationDTO.getLongitude());
		locationDO.setPostalCode(locationDTO.getPostalCode());
		locationDO.setSapStoreID(locationDTO.getSapStoreID());
		locationDO.setStreet(locationDTO.getStreet());
		locationDO.setTodayOpen(locationDTO.getTodayOpen());
		locationDO.setTodayClose(locationDTO.getTodayClose());
		return locationDO;
	}

	public static LocationDTO mapToLocationDTO(LocationDO locationDO) {
		return new LocationDTO.LocationDTOBuilder().setAddressName(locationDO.getAddressName()).setCity(locationDO.getCity())
				.setComplexNumber(locationDO.getComplexNumber()).setLatitude(locationDO.getLatitude())
				.setLongitude(locationDO.getLongitude()).setPostalCode(locationDO.getPostalCode())
				.setShowWarningMessage(locationDO.getShowWarningMessage()).setTodayOpen(locationDO.getTodayOpen())
				.setTodayClose(locationDO.getTodayClose()).setLocationType(locationDO.getLocationType())
				.setSapStoreID(locationDO.getSapStoreID()).setStreet(locationDO.getStreet()).build();
	}

}
