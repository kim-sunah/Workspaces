package com.test02;

import java.util.Arrays;

public class Mtest02 {

	// Deep Copy : 값 자체를 복사해서 새로운 배열 생성
	public static void main(String[] args) {
		int[]originalArr= {10,20,30,40};
		
		//1.배열 인덱스의 값을 복사
		int[] copyOne=new int[originalArr.length];
		for(int i=0; i<copyOne.length;i++) {
			copyOne[i]=originalArr[i];
		}
		System.out.println(Arrays.toString(originalArr));	//[10, 20, 30, 40]
		System.out.println(Arrays.toString(copyOne));		//[10, 20, 30, 40]
		System.out.println(originalArr==copyOne);			//주소값이 같지 않아서 false...?
		copyOne[1]=100;
		System.out.println(Arrays.toString(originalArr));	//[10, 20, 30, 40]
		System.out.println(Arrays.toString(copyOne));		//[10, 100, 30, 40]
	
		//2.원본 배열에게 요청
		int[] copyTwo=originalArr.clone();
		System.out.println(Arrays.toString(originalArr));	//[10, 20, 30, 40]
		System.out.println(Arrays.toString(copyTwo));		//[10, 20, 30, 40]
		System.out.println(originalArr == copyTwo);			//false
		
		copyTwo[1]=100;
		System.out.println(Arrays.toString(originalArr));	//[10, 20, 30, 40]
		System.out.println(Arrays.toString(copyTwo));		//[10, 100, 30, 40]
		
		// 3. System을 사용하여 복사
		int[] systemArray = new int[10];	//10개공간에
		Arrays.fill(systemArray, 7);		//7이 다 들어간다?
		System.out.println(Arrays.toString(systemArray));	//[7, 7, 7, 7, 7, 7, 7, 7, 7, 7]
		
		// System.arrayCopy(원본 배열 객체, 
		//                  원본 시작 위치,
		//                  복사 배열 객체,
		//                  복사 시작 위치,
		//                  복사할 갯수)
		
		System.arraycopy(originalArr, 1, systemArray, 3, 2);
		System.out.println(Arrays.toString(systemArray));
		
		System.out.println("----------------");
		System.out.println(originalArr.hashCode());
		System.out.println(copyOne.hashCode());
		System.out.println(copyTwo.hashCode());
		System.out.println(systemArray.hashCode());
	}
}
