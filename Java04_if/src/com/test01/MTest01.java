package com.test01;

public class MTest01 {

	public static void main(String[] args) {
		prn01();
		prn02(true,false);
	}
	public static void prn01() {
		int i=2;
		int j=20;
		//if
		if(i>j) {
			System.out.println("i��j���� �۽��ϴ�.");
			System.out.println("�׷��� i�� ���� :"+i);
		}
		
		//if~else
		if(i>j) {
			System.out.println("i�� j���� Ů�ϴ�.");
		}else {
			System.out.println("i�� j���� ũ�� �ʽ��ϴ�.");
		}
		//if~else if~
		if(i<j) {
			System.out.println("i�� j���� �۽��ϴ�.");
		}else if(i==j) {
			System.out.println("i�� j�� �����ϴ�.");
		}else if(i>j) {
			System.out.println("i�� j���� Ů�ϴ�.");
		}else {
			System.out.println("????????");
		}
	}
	
	public static void prn02(boolean ring, boolean married) {
		
		if(ring) {
			if(married) {
				System.out.println("����ڰ� �����ñ���!!");
			}else {
				System.out.println("������ �����ñ���!!");
			}
		}else {
			System.out.println("�ַνñ���...");
		}
		
		//-----
		if(ring && married) {
			System.out.println("����ڰ� �����ñ���!!");
		}else if(ring || married) {
			System.out.println("������ �����ñ���!!");
		}else {
			System.out.println("�ַνñ���...");
		}
	}
}
