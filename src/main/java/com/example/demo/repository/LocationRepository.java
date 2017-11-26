package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domainobject.LocationDO;

public interface LocationRepository extends JpaRepository<LocationDO, Long>{

}
