package com.test04;

public class Truck extends Car {
	
	public Truck() {
		System.out.println("truck ����");
	}
	public Truck(String color) {
		super(color);
		System.out.println(color+"�� truck����");
	}
	public void accelPedal() {
		//�ӵ��� ������ �ö󰩴ϴ�.
		//+20
		setSpeed(getSpeed()+20);
		System.out.println("�ӵ��� ������ �ö󰩴ϴ�.");
	}
	public void breakPedal() {
		//�ӵ��� ������ �������ϴ�.
		//-20
		setSpeed(getSpeed()-20);
		if(getSpeed()>0) {
			System.out.println("�ӵ��� ������ �������ϴ�.");
		}else {
			System.out.println("������ϴ�.");
			setSpeed(0);
		}
	}
	public String toString() {
		return getColor()+"�� truck�� "+super.toString();
	}

}
