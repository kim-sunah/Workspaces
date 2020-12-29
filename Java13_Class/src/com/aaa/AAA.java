package com.aaa;

public class AAA {

	//filed(속성)
	private int abc;	//인스턴스 변수(static이 안붙음)
	
	//constructor(생성자):접근제한자 +class이름
	public AAA() {
		System.out.println("AAA생성(기본생성자)");
	}
	
	public AAA(int abc) {
		this.abc=abc;
		System.out.println("AAA생성(파라미터 abc받아서 초기화하면서 생성");
	}
	
	//getter &setter
	public int getAbc() {
		return this.abc;
	}
	public void setAbc(int abc) {
		this.abc=abc;
	}
	
	//method(기능)
	public void prn() {
		System.out.println("AAA의 prn메소드");
	}

}
