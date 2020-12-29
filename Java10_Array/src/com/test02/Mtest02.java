package com.test02;

import java.util.Arrays;

public class Mtest02 {

	// Deep Copy : �� ��ü�� �����ؼ� ���ο� �迭 ����
	public static void main(String[] args) {
		int[]originalArr= {10,20,30,40};
		
		//1.�迭 �ε����� ���� ����
		int[] copyOne=new int[originalArr.length];
		for(int i=0; i<copyOne.length;i++) {
			copyOne[i]=originalArr[i];
		}
		System.out.println(Arrays.toString(originalArr));	//[10, 20, 30, 40]
		System.out.println(Arrays.toString(copyOne));		//[10, 20, 30, 40]
		System.out.println(originalArr==copyOne);			//�ּҰ��� ���� �ʾƼ� false...?
		copyOne[1]=100;
		System.out.println(Arrays.toString(originalArr));	//[10, 20, 30, 40]
		System.out.println(Arrays.toString(copyOne));		//[10, 100, 30, 40]
	
		//2.���� �迭���� ��û
		int[] copyTwo=originalArr.clone();
		System.out.println(Arrays.toString(originalArr));	//[10, 20, 30, 40]
		System.out.println(Arrays.toString(copyTwo));		//[10, 20, 30, 40]
		System.out.println(originalArr == copyTwo);			//false
		
		copyTwo[1]=100;
		System.out.println(Arrays.toString(originalArr));	//[10, 20, 30, 40]
		System.out.println(Arrays.toString(copyTwo));		//[10, 100, 30, 40]
		
		// 3. System�� ����Ͽ� ����
		int[] systemArray = new int[10];	//10��������
		Arrays.fill(systemArray, 7);		//7�� �� ����?
		System.out.println(Arrays.toString(systemArray));	//[7, 7, 7, 7, 7, 7, 7, 7, 7, 7]
		
		// System.arrayCopy(���� �迭 ��ü, 
		//                  ���� ���� ��ġ,
		//                  ���� �迭 ��ü,
		//                  ���� ���� ��ġ,
		//                  ������ ����)
		
		System.arraycopy(originalArr, 1, systemArray, 3, 2);
		System.out.println(Arrays.toString(systemArray));
		
		System.out.println("----------------");
		System.out.println(originalArr.hashCode());
		System.out.println(copyOne.hashCode());
		System.out.println(copyTwo.hashCode());
		System.out.println(systemArray.hashCode());
	}
}
