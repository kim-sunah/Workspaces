package com.bbb;

import com.aaa.AAA;

public class BBB extends AAA{
	
	private int b;
	
	public BBB() {
		super();	//부모 생성자 호출
		System.out.println("BBB생성 (기본 생성자)");
	}
	public BBB(int b) {
		this.b=b;
		System.out.println("BBB생성(파라미터b받아서 초기화, 생성");
	}
	public BBB(int abc, int b) {
		//super(abc);
		this.b=b;
		System.out.println("BBB생성(abc,b받아서 초기화 및 생성");
	}
	
	public int getB() {
		return this.b;
	}
	public void setB(int b) {
		this.b=b;
	}
	
	/*
	 * super:부모객체
	 * this:나 객체
	 */
	public int getSum() {
		return super.getAbc() + this.getB();
	}
	
	@Override
	public void prn() {
		System.out.println("BBB.prn()");
	}
	
}
