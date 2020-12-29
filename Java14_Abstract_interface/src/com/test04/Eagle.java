package com.test04;

//자식 class->class(단일 상속)-> interface(다중상속)
public class Eagle extends Animal implements Bird{

	@Override
	public void fly() {
		System.out.println("퍼덕퍼덕");
	}
	
	@Override
	public void bark() {
		System.out.println("까약?");
	}
}
