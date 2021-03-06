package com.test01;

public class MTest02 {

	//정수형 리터럴:byte(1), short(2),int(4),long(8) [접미사 I,L]
	public static void main(String[] args) {
		byte b01=126;
		System.out.println(b01);	//126
		byte b02=(byte)128;	//형변환
		System.out.println(b02);	//-128
		
		byte sumB=(byte)(b01+b02);	//연산의 기본은 int
		System.out.println(sumB);	//-2
		
		System.out.println("--------------------------");
		
		short s01=32767;
		System.out.println(s01);	//32767
		short s02=2;
		System.out.println(s02);	//2
		short sumS=(short)(s01+s02);
		System.out.println(sumS);	//-32767
		
		System.out.println("------------------------------------");
		
		int i=10;
		int j=20;
		int sum=i+j;
		System.out.println(sum);	//30
		i=30;
		sum=i+j;
		System.out.println(sum);	//50
		
		System.out.println("-------------------");
		
		long l01=3000000000000l;
		long l02=4000000000000l;
		long sumL=l01+l02;
		System.out.println(sumL);	//700000000
		
		System.out.println("----------------------");
		
		//0b : 2진수
		System.out.println(0b10);	//2	
		//00 : 8진수
		System.out.println(0010);	//8
		//0x : 16진수
		System.out.println(0x10);	//16
	}
}
