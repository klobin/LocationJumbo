package com.jumbo.service;

import java.util.List;

import com.jumbo.datatransferobject.StoresDTO;
import com.jumbo.domainobject.LocationDO;
import com.jumbo.exception.LocationSearchException;

public interface StoreService {

	void addStores(List<LocationDO> storeLocations);

	StoresDTO findStores(String location, long noOfStores) throws LocationSearchException;

	StoresDTO getAllStores();

}
