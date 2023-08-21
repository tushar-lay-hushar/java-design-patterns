package com.creational.factory;

import java.util.Random;

import com.creational.factory.bike.Bike;
import com.creational.factory.bike.Hornet;
import com.creational.factory.bike.Unicorn;

public class BikeFactory {
	
	public static Bike getBike(String bikeName) {
		
		Bike bike = null;
		Random num = new Random();
		long engineNo = 849623000000l + num.nextInt(999999);
		String registrationNo = "MH-14-" + Character.valueOf((char)(65 + num.nextInt(27))).toString() + Character.valueOf((char)(65 + num.nextInt(27))).toString() + "-" + (1000 +num.nextInt(8999)); 
		
		if (bikeName.equalsIgnoreCase("Shine"))
			bike = new Unicorn(engineNo, registrationNo);
		else if (bikeName.equalsIgnoreCase("Hornet"))
			bike = new Hornet(engineNo, registrationNo);
		else
			throw new IllegalArgumentException("Bike Not in catalogue!!!");
		
		return bike;
	}

}
