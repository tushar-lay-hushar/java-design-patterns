package com.creational.builder.test;

import com.creational.builder.Bike;

public class Test {

	public static void main(String[] args) {
		
		Bike bike = new Bike.BikeBuilder("Hornet").addAccessory("Leg Gaurd").addAccessory("Fog Lamps").build();
		
		System.out.println(bike);
		
		bike = new Bike.BikeBuilder("Unicorn").addAccessory("Leg Gaurd").addAccessory("Luggage Holder").build();
		
		System.out.println(bike);
	}
}
