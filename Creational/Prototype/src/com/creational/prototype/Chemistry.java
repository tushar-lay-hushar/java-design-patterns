package com.creational.prototype;

public class Chemistry implements Notes {
	
	@Override
	public Notes clone() throws CloneNotSupportedException {
		return (Notes) super.clone();
	}

	@Override
	public void readNotes() {
		System.out.println("Reading Chemistry Notes!!");
	}

}
