package com.example.demo.util;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

import com.example.demo.domainobject.LocationDO;
import com.google.maps.model.Geometry;

public class CalculateDistance {
	
	 public static double distanceTo(Geometry geometry, LocationDO loc)
	    {
	        double earthRadius = 3958.75;
	        double dLat = toRadians(geometry.location.lat - loc.getLatitude());
	        double dLng = toRadians(geometry.location.lng - loc.getLongitude());
	        double a = sin(dLat/2) * sin(dLat/2) +
	            cos(Math.toRadians(geometry.location.lat)) * 
	            cos(Math.toRadians(geometry.location.lat)) *
	            sin(dLng/2) * sin(dLng/2);
	        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	        double dist = earthRadius * c;
	        return dist * 1609;
	    }
}
