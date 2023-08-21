package com.creational.sigleton.test;

import com.creational.singleton.Singleton;

public class Test {

	public static void main(String[] args) {
		
		Singleton first = Singleton.getIntance();
		System.out.println(first);
		
		Singleton second = Singleton.getIntance();
		System.out.println(second);

	}

}
