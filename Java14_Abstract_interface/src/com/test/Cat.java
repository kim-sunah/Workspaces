package com.test;

public class Cat extends Animal{

	@Override
	public void bark() {
		System.out.println("具克");
	}
	
	@Override
	public void eat(String feed) {
		System.out.println("具克捞啊"+feed+"冈绰促.");
	}
}
