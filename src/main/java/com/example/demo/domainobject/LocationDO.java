package com.example.demo.domainobject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LocationDO {

	@Id
	@GeneratedValue
	private Long id;
	
	private String city;

	private String postalCode;

	private String street;

	private String addressName;

	private String uuid;

	private Double longitude;

	private Double latitude;

	private Long complexNumber;

	private Boolean showWarningMessage;

	private String todayOpen;

	private String todayClose;

	private String locationType;

	private Long sapStoreID;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Long getComplexNumber() {
		return complexNumber;
	}

	public void setComplexNumber(Long complexNumber) {
		this.complexNumber = complexNumber;
	}

	public Boolean getShowWarningMessage() {
		return showWarningMessage;
	}

	public void setShowWarningMessage(Boolean showWarningMessage) {
		this.showWarningMessage = showWarningMessage;
	}

	public String getTodayOpen() {
		return todayOpen;
	}

	public void setTodayOpen(String todayOpen) {
		this.todayOpen = todayOpen;
	}

	public String getTodayClose() {
		return todayClose;
	}

	public void setTodayClose(String todayClose) {
		this.todayClose = todayClose;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public Long getSapStoreID() {
		return sapStoreID;
	}

	public void setSapStoreID(Long sapStoreID) {
		this.sapStoreID = sapStoreID;
	}
}
