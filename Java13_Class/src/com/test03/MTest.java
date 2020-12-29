package com.test03;

public class MTest {

	public static void main(String[] args) {
		MySum my=new MySum();
		
		System.out.println(my.sum(10));
		System.out.println(my.sum(20,30));
		System.out.println(my.sum(40,50,60));
		System.out.println(my.sum(1.5,2.7));
	}
}
