package com.test01;

public class MTest03 {
	public static void main(String[] args) {
		// 1. a ~ z������ 'char' ���� ������ 1���� �迭�� ������.
		// ��, �ݺ����� �������.
		char[]ch=new char[26];
		for (int i=0;i<ch.length;i++) {
			ch[i]=(char)('a'+i);
		}
		// 2. ������ ���� �迭�� 
		/*
		 * a b c d e f
		 * g h i j k l
		 * m n o p q r
		 * s t u v w x
		 * y z
		 */
		// ���·� �������.
		prn(ch);
		
		// 3. �Ųٷ� �������.
		/*
		 * z y x w v u
		 * ...
		 */
		reversePrn(ch);
		
		// 4. �빮�ڷ� �������.
		upperPrn(ch);
	}
	private static void upperPrn(char[] ch) {
		for (int i=1; i<=ch.length;i++) {
			System.out.print(Character.toUpperCase(ch[i-1])+" ");
			
			if(i%6==0) {
				System.out.println();
			}
		}
		System.out.println("\n");
	}
	
	private static void reversePrn(char[]ch) {
		int temp=1;
		for (int i=ch.length;i>0;i--) {
			System.out.print(ch[i-1]+" ");
			
			if(temp%6==0) {
				System.out.println();
			}
			temp++;
		}
		System.out.println("\n");
	}
	
	private static void prn(char[]ch) {
		for (int i=1; i<=ch.length; i++) {
			System.out.print(ch[i-1]+" ");
			if(i%6==0) {
				System.out.println();
			}
		}
		System.out.println("\n");
		
	}


}