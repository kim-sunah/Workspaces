package com.test;

public class Dog extends Animal{
	
	@Override
	public void bark() {
		System.out.println("�۸�");
	}
	
	@Override
	public void eat(String feed) {
		System.out.println("�۸��̰�");
		super.eat(feed);
	}
}
