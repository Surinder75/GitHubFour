package com.github.day3;


public class Country {
	String countryName;
	String capital;
	
	public Country() {
		// set the initial valuesfor instance variable
		countryName= "USA";
		capital = "Washington, D.C.";
		
	}
 public static void main(String[]args) {
	 // Creates an object of Class Country
	 // This will call the constructor
	 
	 Country obj= new Country();
	 
	 // PRINT the value of countryName and capital variables
	 System.out.println(obj.countryName);
	 System.out.println(obj.capital);
	 
	 
 }

}
