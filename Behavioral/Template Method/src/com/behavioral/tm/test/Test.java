package com.behavioral.tm.test;

import com.behavioral.tm.ConcreteWallHouse;
import com.behavioral.tm.GlassWallHouse;
import com.behavioral.tm.House;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Going to build Concrete Wall House");
		 
        House house = new ConcreteWallHouse();
        house.buildhouse();

        System.out.println("Concrete Wall House constructed successfully");

        System.out.println("********************");

        System.out.println("Going to build Glass Wall House");

        house = new GlassWallHouse();
        house.buildhouse();

        System.out.println("Glass Wall House constructed successfully");
	}

}
