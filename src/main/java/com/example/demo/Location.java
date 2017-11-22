package com.example.demo;

public class Location {

	private String      address;
    private double      latitude;
    private double      longitude;
 
    public Location(String addr, double lat, double lng)
    {
        address = addr;
        latitude = lat;
        longitude = lng;
    }
 
    // Compute the distance in meters
    public double distanceTo(Location loc)
    {
        double earthRadius = 3958.75;
        double dLat = Math.toRadians(latitude - loc.latitude);
        double dLng = Math.toRadians(longitude - loc.longitude);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
            Math.cos(Math.toRadians(latitude)) * 
            Math.cos(Math.toRadians(latitude)) *
            Math.sin(dLng/2) * Math.sin(dLng/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double dist = earthRadius * c;
        return dist * 1609;
    }
 
    public String toString()
    {
        return address + " (" + latitude + ", " + longitude + ")";
    }
	
}
