package com.example.demo.datatransferobject;

import java.io.Serializable;
import java.util.List;

public class StoresDTO implements Serializable {

	private static final long serialVersionUID = -5226129143003568804L;

	private List<LocationDTO> stores;

	public StoresDTO() {
		super();
	}

	public StoresDTO(List<LocationDTO> stores) {
		super();
		this.stores = stores;
	}

	public List<LocationDTO> getStores() {
		return stores;
	}

	public void setStores(List<LocationDTO> stores) {
		this.stores = stores;
	}

}
