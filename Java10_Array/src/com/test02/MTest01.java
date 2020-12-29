package com.test02;

import java.util.Arrays;

public class MTest01 {
	
	// Shallow Copy : 얕은 값 복사 (주소값 복사)
	public static void main(String[] args) {
		int[] originalArr= {10,20,30};
		int[] copyArr=originalArr;
		
		System.out.println(Arrays.toString(originalArr));
		System.out.println(Arrays.toString(copyArr));
		
		System.out.println(originalArr==copyArr);
		
		copyArr[1]=100;
		System.out.println(Arrays.toString(originalArr));
		System.out.println(Arrays.toString(copyArr));
		
		//hashcode : 주소
		System.out.println(originalArr.hashCode());
		System.out.println(copyArr.hashCode());
		
	}
}
