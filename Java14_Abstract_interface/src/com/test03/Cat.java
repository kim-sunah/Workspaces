package com.test03;

//extends:class-class(interface-interface)
//implements:�ڼ� class -�θ� interface
public class Cat implements Animal{

	@Override
	public void bark() {
		System.out.println("�߿�");
	}
	
	@Override
	public void eat(String feed) {
		System.out.println("����̰�"+feed+"�Դ´�.");
	}
}
