package com.example.demo.controller;

import static com.example.demo.mapper.StoreMapper.mapToLocationDO;
import static java.util.stream.Collectors.toList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.datatransferobject.StoresDTO;
import com.example.demo.service.StoreService;

/**
 * All operations for stores will be routed through this controller.
 * <p/>
 */

@RestController
@RequestMapping("v1/store")
public class StoreController {

	@Autowired
	private StoreService storeService;

	@PostMapping("/addStore")
	public void addStores(@Valid @RequestBody StoresDTO storesDTO) {
		storeService.addStores(storesDTO.getStores().stream().map(storeLocation -> mapToLocationDO(storeLocation)).collect(toList()));
	}

	@GetMapping("/findStore")
	public StoresDTO findStore(@Valid @RequestParam("location") String location) throws Exception {
		return storeService.findStores(location);
	}
}
