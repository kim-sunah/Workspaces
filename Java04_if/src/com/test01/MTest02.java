package com.test01;

public class MTest02 {
	
	public static void main(String[] args) {
		// 1. �ƱԸ�Ʈ ���� 5�� ����̸� "5�� ����Դϴ�."�� �������.
		test01(10);
		
		// 2. �ƱԸ�Ʈ ���� 2�� ����̸鼭 3�� ����̸� "2�� 3�� ����Դϴ�." �� �������.
		//    �ƴ϶��, "2�� 3�� ����� �ƴմϴ�." �� �������.
		test02(6);
		
		// 3. �ƱԸ�Ʈ ���� �ҹ��ڶ�� "�ҹ��� �Դϴ�.", �빮�ڶ�� "�빮�� �Դϴ�."�� �������.
		// java.lang.Character (Wrapper class) -> method ����.
		test03('A');
	}
	
	public static void test01(int i) {
		if(i%5 ==0) {
			System.out.println("5�� ����Դϴ�.");
		}
	}
	public static void test02(int i) {
		if((i%2==0)&&(i%3==0)) {
			System.out.println("2��3�� ����Դϴ�.");
		}else {
			System.out.println("2�� 3�� ����Դϴ�.");
		}
	}
	public static void test03(char c) {
		if (Character.isUpperCase(c)) {
			System.out.println("�빮�� �Դϴ�.");
		} else if (Character.isLowerCase(c)) {
			System.out.println("�ҹ��� �Դϴ�.");
		}
	}
}
