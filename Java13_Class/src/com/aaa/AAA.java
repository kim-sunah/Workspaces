package com.aaa;

public class AAA {

	//filed(�Ӽ�)
	private int abc;	//�ν��Ͻ� ����(static�� �Ⱥ���)
	
	//constructor(������):���������� +class�̸�
	public AAA() {
		System.out.println("AAA����(�⺻������)");
	}
	
	public AAA(int abc) {
		this.abc=abc;
		System.out.println("AAA����(�Ķ���� abc�޾Ƽ� �ʱ�ȭ�ϸ鼭 ����");
	}
	
	//getter &setter
	public int getAbc() {
		return this.abc;
	}
	public void setAbc(int abc) {
		this.abc=abc;
	}
	
	//method(���)
	public void prn() {
		System.out.println("AAA�� prn�޼ҵ�");
	}

}
