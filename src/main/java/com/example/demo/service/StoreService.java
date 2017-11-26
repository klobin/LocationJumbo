package com.example.demo.service;

import java.util.List;

import com.example.demo.datatransferobject.StoresDTO;
import com.example.demo.domainobject.LocationDO;

public interface StoreService {

	void addStores(List<LocationDO> storeLocations);

	StoresDTO findStores(String location) throws Exception;

}
