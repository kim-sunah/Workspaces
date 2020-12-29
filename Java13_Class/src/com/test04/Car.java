package com.test04;

public class Car {
	private String color;
	private int speed;
	
	public Car() {
		
	}

	public Car(String color) {
		this.color=color;
		//this.speed=0;
	}
	public Car(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void accelPedal() {
		System.out.println("�ӵ��� �ö󰩴ϴ�.");
		speed=speed+10;
	}
	
	public void breakPedal() {
		speed=speed-10;
		if(speed>0) {
			System.out.println("�ӵ��� �پ��ϴ�.");
		}else {
			System.out.println("������ϴ�.");
			speed=0;
		}
	}
	public String toString() {
		return "���� �ӵ��� "+ speed+ "�Դϴ�.";
	}

}
