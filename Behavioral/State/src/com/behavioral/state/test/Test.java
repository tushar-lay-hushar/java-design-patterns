package com.behavioral.state.test;

import com.behavioral.state.context.Fan;

public class Test {

	public static void main(String[] args) {

		Fan fan = new Fan();

		System.out.println(fan);

		fan.pullChain();

		System.out.println(fan);

		fan.pullChain();

		System.out.println(fan);

		fan.pullChain();

		System.out.println(fan);

		fan.pullChain();

	}

}
