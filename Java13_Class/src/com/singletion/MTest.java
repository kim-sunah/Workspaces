package com.singletion;

import java.util.Calendar;

public class MTest {

	public static void main(String[] args) {

		// 생성자를 private으로 만들면, new 생성자(); 사용 불가!
		// Singleton singleton = new Singleton();
		
		Singletion s01= Singletion.getInstance();
		System.out.println(s01);
		
		Singletion s02=Singletion.getInstance();
		System.out.println(s02);
		
		System.out.println(s01==s02);
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		
	}
}
