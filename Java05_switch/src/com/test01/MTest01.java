package com.test01;

public class MTest01 {

	public static void prn01() {
		// if�� ���������� ������ Ȯ��
		// switch�� Ư�� case�� jumping
		// fall through :Ư�� case�κ��� �Ʒ��� �ִ� ����� ��� ����
		int i = 2;

		switch (i) {
		case 1:
			System.out.println("1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;
		case 4:
			System.out.println("4�Դϴ�.");
			break;
		}
	}

	public static void main(String[] args) {
		prn01();
		prn02();
		prn03('b');
	}
	public static void prn03(char c) {
		switch(c) {
		case 'a':
			System.out.println("a�Դϴ�.");
			break;
		case 'b':
			System.out.println("b�Դϴ�.");
			break;
		case 'c':
			System.out.println("c�Դϴ�.");
			break;
		default:
			System.out.println("f�Դϴ�.");
		}
	}
	public static void prn02() {
		int i=6;
		switch(i) {
		case 1:
		case 3:
			System.out.println("Ȧ�� �Դϴ�.");
			break;
		case 2:
		case 4:
			System.out.println("¦���Դϴ�.");
			break;
		default:
			System.out.println("1,2,3,4�� �Է����ּ���");
		}
	}

}
