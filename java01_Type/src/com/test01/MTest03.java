package com.test01;

public class MTest03 {
	//�Ǽ��� ���ͷ� : float(4)[���̻� f,F],double(8)[���̻� d,D]
	public static void main(String[] args) {
		float f01=0.1f;
		float f02=1.8F;
		float sumF=f01 + f02;
		System.out.println(sumF);	//1.9
		
		double d01=0.2;	//�Ǽ��� �⺻ Ÿ��
		double d02=3.7d;
		double sumD=d01+d02;
		System.out.println(sumD);	//3.900000000004	
		//Ÿ���� ���������� 0.0000004�� ����...?
		
	}
	

}
