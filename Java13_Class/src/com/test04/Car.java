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
		System.out.println("속도가 올라갑니다.");
		speed=speed+10;
	}
	
	public void breakPedal() {
		speed=speed-10;
		if(speed>0) {
			System.out.println("속도가 줄어듭니다.");
		}else {
			System.out.println("멈췄습니다.");
			speed=0;
		}
	}
	public String toString() {
		return "현재 속도는 "+ speed+ "입니다.";
	}

}
