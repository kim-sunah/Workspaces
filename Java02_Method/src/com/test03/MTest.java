package com.test03;

public class MTest {
	public static void main(String[] args) {
		int sumValue=MyCalc.mySum(10,3);
		System.out.println(sumValue);	//13
		
		//MyCalcŬ������ �ִ�
		// mySub �޼ҵ带 ȣ��
		// 10�̶�� ����, 3 �̶�� ���� ����
		MyCalc.mySub(10, 3);	//7
		
		// MyCalc Ŭ������ �ִ� myMul �޼ҵ带 ȣ��
		MyCalc my=new MyCalc();	//30.0
		//10,3�� ����
		double mul=my.myMul(10.0, 3.0);
		System.out.println(mul);	//10/3�� ��:3
		
		MyCalc.myDiv(10, 3);	//10%3�� ������: 1
	}
}
