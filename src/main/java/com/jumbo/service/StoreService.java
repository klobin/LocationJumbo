package com.jumbo.service;

import java.util.List;

import com.jumbo.datatransferobject.StoresDTO;
import com.jumbo.domainobject.LocationDO;

public interface StoreService {

	void addStores(List<LocationDO> storeLocations);

	StoresDTO findStores(String location) throws Exception;

}
