package com.test02;

public class MTest01 {
	public static void main(String[] args) {
		//묵시적 형 변환 upCasting(promotion) : 작은타입-> 큰 타입
		byte b01=(byte)100;
		int i01=b01;
		System.out.println(i01);	//100
		
		//명시적 형변환 downCasting(casting):큰타입 -> 작은타입
		int i02=100;
		byte b02=(byte)i02;
		System.out.println(b02);	//100
	}

}
