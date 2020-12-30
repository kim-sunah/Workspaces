package com.test01;

public class Mytest {
	
	public static void main(String[] args) {
		//0	1	2	3	4
		//1	2	3	4	5
		//2	3	4	5	6
		//3	4	5	6	7
		//4	5	6	7	8
		//¹Ýº¹¹®
		int [][]a=new int [5][5];
		int b=1;
		int c=0;
		for(int i=0; i<5;i++) {
			int k=0;
			for(int j=0;j<5;j++) {
			
				a[i][j]=i+k++;
			}
		}
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
	}

}
