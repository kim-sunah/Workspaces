package com.test01;

public class MTest02 {
	
	public static void main(String[] args) {
		// 1. 아규먼트 값이 5의 배수이면 "5의 배수입니다."를 출력하자.
		test01(10);
		
		// 2. 아규먼트 값이 2의 배수이면서 3의 배수이면 "2와 3의 배수입니다." 를 출력하자.
		//    아니라면, "2와 3의 배수가 아닙니다." 를 출력하자.
		test02(6);
		
		// 3. 아규먼트 값이 소문자라면 "소문자 입니다.", 대문자라면 "대문자 입니다."를 출력하자.
		// java.lang.Character (Wrapper class) -> method 보자.
		test03('A');
	}
	
	public static void test01(int i) {
		if(i%5 ==0) {
			System.out.println("5의 배수입니다.");
		}
	}
	public static void test02(int i) {
		if((i%2==0)&&(i%3==0)) {
			System.out.println("2와3의 배수입니다.");
		}else {
			System.out.println("2와 3의 배수입니다.");
		}
	}
	public static void test03(char c) {
		if (Character.isUpperCase(c)) {
			System.out.println("대문자 입니다.");
		} else if (Character.isLowerCase(c)) {
			System.out.println("소문자 입니다.");
		}
	}
}
