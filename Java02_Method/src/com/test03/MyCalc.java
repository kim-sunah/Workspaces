package com.test03;

public class MyCalc {

	//���������� �޸𸮿��� ����Ÿ�� �޼ҵ��(�Ķ����)
	public static int mySum(int a,int b) {
		int res=a+b;
		return res;
	}
	
	//void:������ ���� ���� ��!
	public static void mySub(int i, int j) {
		//����: i-j;
		int res=i-j;
		//ȭ�鿡 �� ����� ���
		System.out.println(res);
	}
	
	public double myMul(double i, double j) {
		double result =i*j;
		return result;
	}
	public static void myDiv(int i, int j) {
		//i/j:��
		int mok=i/j;
		//i%j:������
		int namerge=i%j;
		
		System.out.printf("%d/%d�� ��:%d\n",i,j,mok);
		System.out.printf("%d%%%d�� ������: %d",i,j,namerge);
	}
}
