package com.github.day3;


public class Country {
	String countryName;
	String capital;
	String County;
	
	public Country() {
		// set the initial valuesfor instance variable
		countryName= "USA";
		capital = "Washington, D.C.";
		County = "Queens";
		County1 = "Kings";
	}
 public static void main(String[]args) {
	 // Creates an object of Class Country
	 // This will call the constructor
	 
	 Country obj= new Country();
	 
	 // PRINT the value of countryName and capital variables
	 System.out.println(obj.countryName);
	 System.out.println(obj.capital);
	 System.out.println(obj.County);
	 System.out.println(obj.County1);
	 
	 
 }

}
