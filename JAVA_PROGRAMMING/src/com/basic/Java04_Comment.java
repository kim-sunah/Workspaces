package com.basic;

public class Java04_Comment {

	//한줄주석
	
	/*
	 * 여러 줄 주석
	 */
	private String name;
	/**
	이름 저장용 멤버변수
	 */
	
	private int age;
	/**
	 나이 저장용 멤버변수
	 */
	
	public Java04_Comment(String name, int age) {
		/**
		 객체 생성시 멤버변수 초기화용 매개변수 있는 생성자
		 */
		this.name=name;
		this.age=age;
	}
	
	public void print() {
		/**
		 멤버변수가 가진 값을 콘솔 화면에 출력시키는 메소드
		 */
		System.out.println(name+","+age);
	}
	
	
}
