package com.creational.prototype;

public class EnglishNotes implements Notes {
	
	@Override
	public Notes clone() throws CloneNotSupportedException {
		return (Notes) super.clone();
	}

	@Override
	public void readNotes() {
		System.out.println("Reading English Notes!!");
	}

}
