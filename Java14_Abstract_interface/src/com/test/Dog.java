package com.test;

public class Dog extends Animal{
	
	@Override
	public void bark() {
		System.out.println("港港");
	}
	
	@Override
	public void eat(String feed) {
		System.out.println("港港捞啊");
		super.eat(feed);
	}
}
