package com.test02;

public class MTest {
	public static void main(String[] args) {
		prn();
	}
	public static void prn() {
		int i=0;
		
		while(i<10) {
			i++;
			
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
