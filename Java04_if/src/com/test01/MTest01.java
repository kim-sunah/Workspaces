package com.test01;

public class MTest01 {

	public static void main(String[] args) {
		prn01();
		prn02(false,false);
	}
	public static void prn01() {
		int i=2;
		int j=20;
		//if
		if(i>j) {
			System.out.println("i는j보다 작습니다.");
			System.out.println("그래서 i의 값은 :"+i);
		}
		
		//if~else
		if(i>j) {
			System.out.println("i가 j보다 큽니다.");
		}else {
			System.out.println("i가 j보다 크지 않습니다.");
		}
		//if~else if~
		if(i<j) {
			System.out.println("i가 j보다 작습니다.");
		}else if(i==j) {
			System.out.println("i랑 j는 같습니다.");
		}else if(i>j) {
			System.out.println("i가 j보다 큽니다.");
		}else {
			System.out.println("????????");
		}
	}
	
	public static void prn02(boolean ring, boolean married) {
		
		if(ring) {
			if(married) {
				System.out.println("배우자가 있으시군요!!");
			}else {
				System.out.println("연인이 있으시군요!!");
			}
		}else {
			System.out.println("솔로시군요...");
		}
		
		//-----
		if(ring && married) {
			System.out.println("배우자가 있으시군요!!");
		}else if(ring || married) {
			System.out.println("연인이 있으시군요!!");
		}else {
			System.out.println("솔로시군요...");
		}
	}
}
