package com.test04;

public class SportsCar extends Car{
	
	public SportsCar() {
		System.out.println("sports cal����");
	}
	public SportsCar(String color) {
		System.out.println(color+"�� sports cal����");
	}
	
	@Override
	public void accelPedal() {
		//�ӵ��� �� ������ �ö󰩴ϴ�.
		//+30
		//speed +=30;
		setSpeed(getSpeed() +30);
		System.out.println("�ӵ��� �� ������ �ö󰩴ϴ�.");
	}
	
	@Override
	public void breakPedal() {
		//�ӵ��� �� ������ �������ϴ�.
		//-30
		setSpeed(getSpeed()-30);
		if(getSpeed()>0) {
			System.out.println("�ӵ��� �� ������ �������ϴ�.");
		}else {
			System.out.println("������ϴ�.");
			setSpeed(0);
		}
	}
	@Override
	public String toString() {
		//sports car�� ���� �ӵ��� ���� �Դϴ�.
		//return "sports car�� ���� �ӵ��� "+getSpeed()+"�Դϴ�.;
		return "sports car�� "+super.toString();
	}

}
