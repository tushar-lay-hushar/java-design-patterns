package com.creational.factory.test;

import com.creational.factory.BikeFactory;
import com.creational.factory.bike.Bike;

public class Test {
	public static void main(String[] args) {
		
		Bike bike = BikeFactory.getBike("hornet");
		
		bike.startEngine();
		bike.ride();
		bike.stopEngine();
	}
}
