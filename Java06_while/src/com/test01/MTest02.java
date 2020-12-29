package com.test01;

public class MTest02 {
	
	public static void main(String[] args) {
		// 1. 1~100 까지의 숫자를 역순으로 출력하자.
		test01();
		
		// 2. 1~100 까지의 숫자 중, 4의 배수만 출력하자.
		test02();
		
		// 3. 1~100 까지의 숫자 중, 7의 배수의 갯수(14)와 
		// 7의 배수의 총 합(735)을 출력하자.
		test03();
	}
	
	public static void test01() {
		int i=100;
		
		while(i>0) {
			System.out.println(i);
			i--;
		}
	}
	
	public static void test02() {
		int i=1;
		
		while(i<=100) {
			if (i%4==0) {
				System.out.println(i);
			}
			i++;
		}
	}
	public static void test03() {
		int i=1;
		int sum=0;
		int count=0;
		while(i<=100) {
			if(i%7==0) {
				count++;
				sum +=i;
			}
			i++;
		}
		System.out.println("7의 배수의 갯수 : "+count);
		System.out.println("7의 배수의 총 합 "+sum);
	}
}
