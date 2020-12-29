package com.test03;

public class Dog implements Animal{
	
	@Override
	public void bark() {
		System.out.println("港港");
	}
	
	@Override
	public void eat(String feed) {
		System.out.println(feed+"冈绰 港港捞");
	}
	

}
