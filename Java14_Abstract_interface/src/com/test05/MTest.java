package com.test05;

import java.util.Scanner;

public class MTest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("도형을 선택해주세요[1:원 2:삼각형 4:사각형");
		
		int select =sc.nextInt();
		Area ar=null;
		
		switch(select) {
		case 1:
			ar=new Circle();
			break;
		case 2:
			ar=new Triangle();
			break;
		case 3:
			ar=new Square();
			break;
		}
		ar.make();
		ar.print();
		
		
	}

}
