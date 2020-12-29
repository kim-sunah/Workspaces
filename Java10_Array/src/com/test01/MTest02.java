package com.test01;

import java.util.Arrays;

public class MTest02 {
	public static void main(String[] args) {
		//방법1
		int [][]a=new int [3][2];
		a[0][0]=1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		a[2][0] = 5;
		a[2][1] = 6;
		
		//방법2
		int[][]b=new int [3][];
		b[0]=new int [3];
		b[1]=new int [5];
		b[2]=new int [2];
		
		//방법3
		int [][]c=new int[][] {
			{1,2},
			{3,4,5,6},
			{7,8,9}
		};
		
		//방법4
		int[][]d= {{1,2,3,4},{5},{6,7},{8,9,10}};
		prn(d);
		
		//System.out.println(Arrays.deepToString(d));
		
		String [][]s= {
				{"Have","a","Good","Day"},
				{"너무","어려워"},
				{"배열","이차원 배열"}
		};
		test(s);
	}
	public static void test(String[][] arr) {
		// Good -> Nice
		// 어려워 -> 쉬워
		// 전체 출력
		arr[0][2]="Nice";
		arr[1][1]="쉬워";
		
		for(int i=0;i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	/*
	 * 1 2 3 4
	 * 5
	 * 6 7
	 * 8 9 10
	 */
	public static void prn(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
