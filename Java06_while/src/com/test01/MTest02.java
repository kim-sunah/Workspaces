package com.test01;

public class MTest02 {
	
	public static void main(String[] args) {
		// 1. 1~100 ������ ���ڸ� �������� �������.
		test01();
		
		// 2. 1~100 ������ ���� ��, 4�� ����� �������.
		test02();
		
		// 3. 1~100 ������ ���� ��, 7�� ����� ����(14)�� 
		// 7�� ����� �� ��(735)�� �������.
		test03();
	}
	
	public static void test01() {
		int i=100;
		
		while(i>0) {
			System.out.println(i);
			i--;
		}
	}
	
	public static void test02() {
		int i=1;
		
		while(i<=100) {
			if (i%4==0) {
				System.out.println(i);
			}
			i++;
		}
	}
	public static void test03() {
		int i=1;
		int sum=0;
		int count=0;
		while(i<=100) {
			if(i%7==0) {
				count++;
				sum +=i;
			}
			i++;
		}
		System.out.println("7�� ����� ���� : "+count);
		System.out.println("7�� ����� �� �� "+sum);
	}
}