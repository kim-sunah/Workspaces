package com.test03;

public class MTest {

	/*
	 * System.out.print(��):���, �ٹٲ�X
	 * System.out print(��):���, �ٹٲ� O
	 * System.out.print(format.��) : format�� ���� ���, �ٹٲ�X
	 * 	format:java.util.Formatter
	 */
	public static void main(String[] args) {
		int i=100;
		System.out.print("1.i="+i);		//100
		System.out.println("2.i="+i);	//100
		System.out.printf("3.i=%d",i);	//100
		System.out.print("\t 4. \n");	//�ƹ��͵� �ȳ���
		System.out.println("--------");
		
		/*
		 * �������� ����� 100(su)���̰�, ������ 'A(ch)'�� ���Դ�.
		 * ���� ���� ���������� 90.50(d)%�̴�.
		 */
		
		int su=100;
		char ch='A';
		double d=90.50d;
		System.out.printf("�������� ����� %10d ���̰�, ������'%3c'�� ���Դ�."
				+ "\n ���� ���� ���������� %.2f%%�̴�",su,ch,d);
		
		
		
	}
}