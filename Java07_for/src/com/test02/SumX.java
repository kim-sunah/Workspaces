package com.test02;

public class SumX {
	/*
	 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 와 같이 출력하고,
	 * X의 총 합 출력
	 */

	public static void main(String[] args) {
		int cnt = 1;
		int sum = 0;

		for (int j = 0; j < 5; j++) {
			for (int k = 0; k < 5; k++) {
				System.out.printf("%3d",cnt++);
				if(j==k||j+k==4) {
					sum+=cnt;
				}
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}
