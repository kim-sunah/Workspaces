package com.test;

//�߻� Ŭ���� : �߻� �޼ҵ带 ���� �� �ִ� Ŭ���� -> new ������ ��� �Ұ�!
public abstract class Animal {

	//�߻� �޼ҵ�:��ӹ޴� �ڽ� Ŭ������ "�ݵ��"����!
	public abstract void bark();
	
	public void eat(String feed) {
		System.out.println(feed+"�Դ´�.");
	}
}
