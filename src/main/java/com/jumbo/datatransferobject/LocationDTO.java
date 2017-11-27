package com.jumbo.datatransferobject;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class LocationDTO implements Serializable {

	private static final long serialVersionUID = 6050149253197068551L;

	private Long id;

	private String city;

	private String postalCode;

	private String street;
	
	private String street2;

	private String street3;
	
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

	public LocationDTO() {
		super();
	}

	public LocationDTO(Long id, String city, String postalCode, String street, String street2, String street3, String addressName, String uuid,
			Double longitude, Double latitude, Long complexNumber, Boolean showWarningMessage, String todayOpen,
			String todayClose, String locationType, Long sapStoreID) {
		super();
		this.id = id;
		this.city = city;
		this.postalCode = postalCode;
		this.street = street;
		this.street2 = street2;
		this.street3 = street3;
		this.addressName = addressName;
		this.uuid = uuid;
		this.longitude = longitude;
		this.latitude = latitude;
		this.complexNumber = complexNumber;
		this.showWarningMessage = showWarningMessage;
		this.todayOpen = todayOpen;
		this.todayClose = todayClose;
		this.locationType = locationType;
		this.sapStoreID = sapStoreID;
	}

	public Long getId() {
		return id;
	}

	public String getCity() {
		return city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getStreet() {
		return street;
	}

	public String getStreet2() {
		return street2;
	}

	public String getStreet3() {
		return street3;
	}

	public String getAddressName() {
		return addressName;
	}

	public String getUuid() {
		return uuid;
	}

	public Double getLongitude() {
		return longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Long getComplexNumber() {
		return complexNumber;
	}

	public Boolean getShowWarningMessage() {
		return showWarningMessage;
	}

	public String getTodayOpen() {
		return todayOpen;
	}

	public String getTodayClose() {
		return todayClose;
	}

	public String getLocationType() {
		return locationType;
	}

	public Long getSapStoreID() {
		return sapStoreID;
	}

	public static class LocationDTOBuilder {

		private Long id;

		private String city;

		private String postalCode;

		private String street;

		private String street2;
		
		private String street3;
		
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

		public LocationDTOBuilder setId(Long id) {
			this.id = id;
			return this;
		}

		public LocationDTOBuilder setCity(String city) {
			this.city = city;
			return this;
		}

		public LocationDTOBuilder setPostalCode(String postalCode) {
			this.postalCode = postalCode;
			return this;
		}

		public LocationDTOBuilder setStreet(String street) {
			this.street = street;
			return this;
		}
		

		public LocationDTOBuilder setStreet2(String street2) {
			this.street2 = street2;
			return this;
		}

		public LocationDTOBuilder setStreet3(String street3) {
			this.street3 = street3;
			return this;
		}

		public LocationDTOBuilder setAddressName(String addressName) {
			this.addressName = addressName;
			return this;
		}

		public LocationDTOBuilder setUuid(String uuid) {
			this.uuid = uuid;
			return this;
		}

		public LocationDTOBuilder setLongitude(Double longitude) {
			this.longitude = longitude;
			return this;
		}

		public LocationDTOBuilder setLatitude(Double latitude) {
			this.latitude = latitude;
			return this;
		}

		public LocationDTOBuilder setComplexNumber(Long complexNumber) {
			this.complexNumber = complexNumber;
			return this;
		}

		public LocationDTOBuilder setShowWarningMessage(Boolean showWarningMessage) {
			this.showWarningMessage = showWarningMessage;
			return this;
		}

		public LocationDTOBuilder setTodayOpen(String todayOpen) {
			this.todayOpen = todayOpen;
			return this;
		}

		public LocationDTOBuilder setTodayClose(String todayClose) {
			this.todayClose = todayClose;
			return this;
		}

		public LocationDTOBuilder setLocationType(String locationType) {
			this.locationType = locationType;
			return this;
		}

		public LocationDTOBuilder setSapStoreID(Long sapStoreID) {
			this.sapStoreID = sapStoreID;
			return this;
		}

		public LocationDTO build() {
			return new LocationDTO(id, city, postalCode, street, street2, street3, addressName, uuid, longitude, latitude, complexNumber,
					showWarningMessage, todayOpen, todayClose, locationType, sapStoreID);
		}

	}

}
