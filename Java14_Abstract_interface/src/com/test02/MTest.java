package com.test02;

import java.util.Scanner;

public class MTest {
	
	/*
	 * 동적 바인딩 - 실행 시 메모리 할당을 하면서 메소드를 동적으로 연동
	 * 1.코드 절약
	 * 2.실행속도 향상
	 * 3.행위 은닉
	 */
	
	public static void main(String[] args) {
		System.out.println("선택해주세요 [1:고양이, 2:멍멍이, 3:거북이");
		Scanner sc=new Scanner(System.in);
		int select=sc.nextInt();	//입력하게 하면
		
		Animal animal=null;	//애니멀값을 초기화하고
		
		switch(select) {	//조건문을 실행시킨다.
		case 1:
			animal=new Cat();
			break;
		case 2:
			animal=new Dog();
			break;
		case 3:
			animal=new Turtle();
			break;
		}
		animal.start();
		animal.stop();
		
	}

}
