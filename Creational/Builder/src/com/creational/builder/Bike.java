package com.creational.builder;

import java.util.ArrayList;
import java.util.Random;

public class Bike {
	
	private String model;
	private String engineCapacity;
	private String wheelSize;
	private long engineNo;
	private String registrationNo;
	private ArrayList<String> accessories;
	
	public Bike(BikeBuilder bikeBuilder) {
		this.model = bikeBuilder.model;
		this.engineCapacity = bikeBuilder.engineCapacity;
		this.wheelSize = bikeBuilder.wheelSize;
		this.engineNo = bikeBuilder.engineNo;
		this.registrationNo = bikeBuilder.registrationNo;
		this.accessories = bikeBuilder.accessories;
	}
	
	public String getModel() {
		return model;
	}

	public String getEngineCapacity() {
		return engineCapacity;
	}

	public String getWheelSize() {
		return wheelSize;
	}

	public long getEngineNo() {
		return engineNo;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public ArrayList<String> getAccessories() {
		return accessories;
	}

	@Override
	public String toString() {
		return "Bike [model=" + model + ", engineCapacity=" + engineCapacity + ", wheelSize=" + wheelSize
				+ ", engineNo=" + engineNo + ", registrationNo=" + registrationNo + ", accessories=" + accessories
				+ "]";
	}

	public static class BikeBuilder {
		
		private String model;
		private String engineCapacity;
		private String wheelSize;
		private ArrayList<String> accessories;
		private long engineNo;
		private String registrationNo;
		
		public BikeBuilder(String model, String engineCapacity, String wheelSize) {
			Random num = new Random();
			this.model = model;
			this.accessories = new ArrayList<String>();
			this.engineNo = 849623000000l + num.nextInt(999999);
			this.registrationNo = "MH-14-" + Character.valueOf((char)(65 + num.nextInt(27))).toString() + Character.valueOf((char)(65 + num.nextInt(27))).toString() + "-" + (1000 +num.nextInt(8999));
			this.engineCapacity = engineCapacity;
			this.wheelSize = wheelSize;
		}
		
		public BikeBuilder(String model) {
			Random num = new Random();
			this.model = model;
			this.accessories = new ArrayList<String>();
			this.engineNo = 849623000000l + num.nextInt(999999);
			this.registrationNo = "MH-14-" + Character.valueOf((char)(65 + num.nextInt(27))).toString() + Character.valueOf((char)(65 + num.nextInt(27))).toString() + "-" + (1000 +num.nextInt(8999));
			if (model.equalsIgnoreCase("Hornet")) {
				this.engineCapacity = "160cc";
				this.wheelSize = "19R";
			} else if (model.equalsIgnoreCase("Unicorn")) {
				this.engineCapacity = "150cc";
				this.wheelSize = "17R";
			}
		}
		
		public BikeBuilder addAccessory(String accessory) {
			this.accessories.add(accessory);
			return this;
		}
		
		public Bike build() {
			return new Bike(this);
		}
	}
}
