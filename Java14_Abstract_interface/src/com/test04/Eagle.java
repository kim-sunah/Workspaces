package com.test04;

//�ڽ� class->class(���� ���)-> interface(���߻��)
public class Eagle extends Animal implements Bird{

	@Override
	public void fly() {
		System.out.println("�۴��۴�");
	}
	
	@Override
	public void bark() {
		System.out.println("���?");
	}
}
