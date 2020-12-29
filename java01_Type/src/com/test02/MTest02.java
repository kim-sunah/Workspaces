package com.test02;

public class MTest02 {

	public static void main(String[] args) {
		//Wrapper Class : 기본타입을 참조타입으로 바꿈
		//참조타입: 주소값
		//type변수 = new type();
		//			값;
		
		//boxing:값(기본타입)->참조타입
		Integer i=new Integer(100);
		System.out.println(i);			//100
		
		//unBoxing : 참조타입 -> 기본타입(값)
		//명시적
		int j=i.intValue();
		//묵시적
		int k=i;
		
		System.out.println(j);			//100
		System.out.println(k);			//100
	}
}
