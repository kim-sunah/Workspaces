package com.bbb;

import com.aaa.AAA;

public class BBB extends AAA{
	
	private int b;
	
	public BBB() {
		super();	//�θ� ������ ȣ��
		System.out.println("BBB���� (�⺻ ������)");
	}
	public BBB(int b) {
		this.b=b;
		System.out.println("BBB����(�Ķ����b�޾Ƽ� �ʱ�ȭ, ����");
	}
	public BBB(int abc, int b) {
		//super(abc);
		this.b=b;
		System.out.println("BBB����(abc,b�޾Ƽ� �ʱ�ȭ �� ����");
	}
	
	public int getB() {
		return this.b;
	}
	public void setB(int b) {
		this.b=b;
	}
	
	/*
	 * super:�θ�ü
	 * this:�� ��ü
	 */
	public int getSum() {
		return super.getAbc() + this.getB();
	}
	
	@Override
	public void prn() {
		System.out.println("BBB.prn()");
	}
	
}