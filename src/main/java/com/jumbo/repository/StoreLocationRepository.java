package com.jumbo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jumbo.domainobject.LocationDO;

public interface StoreLocationRepository extends JpaRepository<LocationDO, Long>{

}
