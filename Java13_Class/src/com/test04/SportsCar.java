package com.test04;

public class SportsCar extends Car{
	
	public SportsCar() {
		System.out.println("sports cal생성");
	}
	public SportsCar(String color) {
		System.out.println(color+"색 sports cal생성");
	}
	
	@Override
	public void accelPedal() {
		//속도가 더 빠르게 올라갑니다.
		//+30
		//speed +=30;
		setSpeed(getSpeed() +30);
		System.out.println("속도가 더 빠르게 올라갑니다.");
	}
	
	@Override
	public void breakPedal() {
		//속도가 더 빠르게 내려갑니다.
		//-30
		setSpeed(getSpeed()-30);
		if(getSpeed()>0) {
			System.out.println("속도가 더 빠르게 내려갑니다.");
		}else {
			System.out.println("멈췄습니다.");
			setSpeed(0);
		}
	}
	@Override
	public String toString() {
		//sports car의 현재 속도는 ㅇㅇ 입니다.
		//return "sports car의 현재 속도는 "+getSpeed()+"입니다.;
		return "sports car의 "+super.toString();
	}

}
