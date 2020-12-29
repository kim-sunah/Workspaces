package com.test02;

public class Cat extends Animal{

	@Override
	public void start() {
		System.out.println("¾ß¿ËÀÌ°¡ °È´Â´Ù.");
	}
	
	@Override
	public void stop() {
		System.out.println("¾ß¿ËÀÌ ¸ØÃè´Ù.");
	}
}
