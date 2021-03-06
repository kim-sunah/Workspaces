package com.test01;

public class MTest03 {
	public static void main(String[] args) {
		// 1. a ~ z까지의 'char' 값을 가지는 1차원 배열을 만들자.
		// 단, 반복문을 사용하자.
		char[]ch=new char[26];
		for (int i=0;i<ch.length;i++) {
			ch[i]=(char)('a'+i);
		}
		// 2. 위에서 만든 배열을 
		/*
		 * a b c d e f
		 * g h i j k l
		 * m n o p q r
		 * s t u v w x
		 * y z
		 */
		// 형태로 출력하자.
		prn(ch);
		
		// 3. 거꾸로 출력하자.
		/*
		 * z y x w v u
		 * ...
		 */
		reversePrn(ch);
		
		// 4. 대문자로 출력하자.
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
