package com.test02;

import java.util.Scanner;

public class MTest {
	
	/*
	 * ���� ���ε� - ���� �� �޸� �Ҵ��� �ϸ鼭 �޼ҵ带 �������� ����
	 * 1.�ڵ� ����
	 * 2.����ӵ� ���
	 * 3.���� ����
	 */
	
	public static void main(String[] args) {
		System.out.println("�������ּ��� [1:������, 2:�۸���, 3:�ź���");
		Scanner sc=new Scanner(System.in);
		int select=sc.nextInt();	//�Է��ϰ� �ϸ�
		
		Animal animal=null;	//�ִϸְ��� �ʱ�ȭ�ϰ�
		
		switch(select) {	//���ǹ��� �����Ų��.
		case 1:
			animal=new Cat();
			break;
		case 2:
			animal=new Dog();
			break;
		case 3:
			animal=new Turtle();
			break;
		}
		animal.start();
		animal.stop();
		
	}

}