package com.score;

public class MTest {
	public static void main(String[] args) {
		Score na = new Score();
		na.setName("�̵���");
		na.setKor(90);
		na.setEng(40);
		na.setMath(67);
		System.out.println(na);
		
		Score pengsu = new Score("���", 100, 70, 23);
		System.out.println(pengsu);
		
	}
}
