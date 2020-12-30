package com.test01;

public class MTest04 {

	public static void main(String[] args) {
		//1부터10까지랜덤한 숫자를저장하는배열을 만들자
		//그다음에 그 배열안에있는 모든 값을 더해서 출력하자
		//int a[]=new a[10];
//		
//		int[] a;
//		a=new int[10];
		//선언 정의 초기화
		int []b=new int[10];
		b[0]=1;
		
		
//		
		for(int i=0;i<10;i++) {
			b[i] = (int)(Math.random()*10)+1;
			
		}
		System.out.println(b);
		int sum=0;
		
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			
			sum+=b[i];
			
		}
		System.out.println(b);
		System.out.println(sum);
	}
}
