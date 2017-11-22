package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Locator {

	 public static void main(String[] args) throws IOException
	    {
	        String urlStr = 
	"http://www.theoryapp.com/wp-content/uploads/2013/01/mcdonalds.csv";
	        ArrayList<Location> stores = LocationTool.loadData(urlStr);       
	        Scanner scan = new Scanner(System.in);
	        while (true)
	        {
	            System.out.println("Please type in an address:");
	            String  addr = scan.nextLine();
	            if (addr.length() == 0)
	                break;
	             
	            Location loc = LocationTool.makeLocation(addr);
	            System.out.println("Your location is at: " + loc);
	 
	            double distance = -1;
	            Location nearStore = null;
	            for (Location e : stores)
	            {
	                double d = loc.distanceTo(e);
	                if (d <= distance || distance < 0)
	                {
	                    distance = d;
	                    nearStore = e;
	                }
	            }
	            System.out.println("The closet McDonald is at: "
	                + nearStore);
	            System.out.println("The distance is " + 
	                (int) distance + " m");
	        }
	    }
	
}
