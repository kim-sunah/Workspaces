package com.test01;

import java.util.Arrays;

public class MTest01 {

	public static void main(String[] args) {
		//방법1
		int[] a;			//선언
		a=new int[5];		//정의
		a[0] = 1;			// 초기화
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		//방법2
		int[]b=new int[] {6,7,8,9,10};	//선언 정의 초기화
		
		//방법3
		int[]c= {5,4,3,2,1};	//선언 초기화
		
		System.out.println(a[1]);	//2
		System.out.println(b[3]);	//9
		
		System.out.println(c);		//[I@7d6f77cc	//주소값...?
		prn(c);						//54321
		System.out.println(Arrays.toString(c));	//[5, 4, 3, 2, 1]
		
		String[]q=new String[] {"have","a","nice","day"};
		modi(q);
	}
	public static void modi(String[] test) {
		//nice를 good으로 바꿔서 전체 출력
		test[2]="good";
		for(int i=0; i<test.length; i++) {
			System.out.println(test[i]+" ");
		}
	}
	public static void prn(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d",arr[i]);
		}
		System.out.println();
	}
}
