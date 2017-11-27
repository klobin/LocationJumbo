package com.jumbo.mapper;

import static org.apache.commons.lang3.RandomStringUtils.random;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Random;

import org.junit.Test;

import com.jumbo.datatransferobject.LocationDTO;
import com.jumbo.domainobject.LocationDO;

public class StoreLocationMapperTest {

	private String city = "ABC";
	private String postalCode = random(4);
	private String addressName = random(6);
	private String uuid = random(5);
	private Double longitude = new Random().nextDouble();
	private Double latitude = new Random().nextDouble();;
	private Long complexNumber = new Random().nextLong();
	private Boolean showWarningMessage = new Random().nextBoolean();
	private String todayOpen = "08:00";
	private String todayClose = "10:00";
	private String locationType = "SupermarktPuP";
	private String street = random(15);
	private Long sapStoreID = new Random().nextLong();

	@Test
	public void testMapToLocationDO() {

		LocationDTO locationDTO = new LocationDTO.LocationDTOBuilder().setAddressName(addressName).setCity(city)
				.setComplexNumber(complexNumber).setLatitude(latitude).setLongitude(longitude).setPostalCode(postalCode)
				.setUuid(uuid).setSapStoreID(sapStoreID).setStreet(street).setShowWarningMessage(showWarningMessage)
				.setTodayOpen(todayOpen).setTodayClose(todayClose).build();

		LocationDO locationDO = StoreLocationMapper.mapToLocationDO(locationDTO);
		assertThat(locationDO, notNullValue());
		assertThat(locationDO.getAddressName(), equalTo(addressName));
		assertThat(locationDO.getCity(), equalTo(city));
		assertThat(locationDO.getUuid(), equalTo(uuid));
		assertThat(locationDO.getLatitude(), equalTo(latitude));
		assertThat(locationDO.getLongitude(), equalTo(longitude));
		assertThat(locationDO.getLocationType(), equalTo(locationType));
		assertThat(locationDO.getSapStoreID(), equalTo(sapStoreID));
		assertThat(locationDO.getTodayOpen(), equalTo(todayOpen));
		assertThat(locationDO.getTodayClose(), equalTo(todayClose));
	}

	@Test
	public void testMapToLocationDTO() {

		LocationDO locationDO = new LocationDO();
		locationDO.setAddressName(addressName);
		locationDO.setCity(city);
		locationDO.setPostalCode(postalCode);
		locationDO.setComplexNumber(complexNumber);
		locationDO.setLocationType(locationType);
		locationDO.setStreet(street);
		locationDO.setTodayClose(todayClose);

		LocationDTO locationDTO = StoreLocationMapper.mapToLocationDTO(locationDO);

		assertThat(locationDTO, notNullValue());
	}

}
