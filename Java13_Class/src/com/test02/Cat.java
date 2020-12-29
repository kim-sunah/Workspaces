package com.test02;

public class Cat extends Animal{
	
	public Cat() {
		System.out.println("³Ä¿ËÀÌ");
	}
	public void bark() {
		super.bark();
		System.out.println("³Ä¿Ë");
	}

}
