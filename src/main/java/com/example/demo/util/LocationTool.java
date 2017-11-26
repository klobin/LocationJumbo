package com.example.demo.util;

import static com.google.maps.GeocodingApi.geocode;

import com.google.maps.GeoApiContext;
import com.google.maps.model.Geometry;

public class LocationTool {

	// Get a Location object from a string address
	public static Geometry getGeometry(String addr) throws Exception {
		String apiKey = "AIzaSyDNMCIE2nO3nqmASocyQXqk1U6MrEA9nvg";
		return geocode(new GeoApiContext().setApiKey(apiKey), addr).await()[0].geometry;
	}
	
}
