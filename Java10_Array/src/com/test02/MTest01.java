package com.test02;

import java.util.Arrays;

public class MTest01 {
	
	// Shallow Copy : ���� �� ���� (�ּҰ� ����)
	public static void main(String[] args) {
		int[] originalArr= {10,20,30};
		int[] copyArr=originalArr;
		
		System.out.println(Arrays.toString(originalArr));	//[10, 20, 30]
		System.out.println(Arrays.toString(copyArr));		//[10, 20, 30]
		
		System.out.println(originalArr==copyArr);			//true
		
		copyArr[1]=100;
		System.out.println(Arrays.toString(originalArr));	//[10, 100, 30]
		System.out.println(Arrays.toString(copyArr));		//[10, 100, 30]
		
		//hashcode : �ּ�
		System.out.println(originalArr.hashCode());			//942731712	
		System.out.println(copyArr.hashCode());				//942731712
		
	}
}
