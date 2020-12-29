package com.test02;

public class Dog extends Animal{

	@Override
	public void start() {
		System.out.println("¸Û¸ÛÀÌ °È´Â´Ù.");
	}
	
	@Override
	public void stop() {
		System.out.println("¸Û¸ÛÀÌ ¸ØÃè´Ù.");
	}
}
