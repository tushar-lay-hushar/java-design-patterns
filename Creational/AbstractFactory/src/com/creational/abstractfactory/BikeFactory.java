package com.creational.abstractfactory;

import java.util.Random;

import com.creational.abstractfactory.bike.Hornet;
import com.creational.abstractfactory.bike.Unicorn;
import com.creational.abstractfactory.vehicle.Vehicle;

public class BikeFactory extends VehicleFactory {

	@Override
	public Vehicle getVehicle(String vehicleName) {
		Vehicle bike = null;
		Random num = new Random();
		long engineNo = 849623000000l + num.nextInt(999999);
		String registrationNo = "MH-14-" + Character.valueOf((char)(65 + num.nextInt(27))).toString() + Character.valueOf((char)(65 + num.nextInt(27))).toString() + "-" + (1000 +num.nextInt(8999)); 
		
		if (vehicleName.equalsIgnoreCase("Hornet"))
			bike = new Hornet(engineNo, registrationNo);
		else if (vehicleName.equalsIgnoreCase("Unicorn"))
			bike = new Unicorn(engineNo, registrationNo);
		else
			throw new IllegalArgumentException("Bike not in catalogue!!!");
		
		return bike;
	}

}
