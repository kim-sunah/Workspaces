package com.test02;

public class MTest02 {

	public static void main(String[] args) {
		//Wrapper Class : �⺻Ÿ���� ����Ÿ������ �ٲ�
		//����Ÿ��: �ּҰ�
		//type���� = new type();
		//			��;
		
		//boxing:��(�⺻Ÿ��)->����Ÿ��
		Integer i=new Integer(100);
		System.out.println(i);			//100
		
		//unBoxing : ����Ÿ�� -> �⺻Ÿ��(��)
		//�����
		int j=i.intValue();
		//������
		int k=i;
		
		System.out.println(j);			//100
		System.out.println(k);			//100
	}
}
