package com.test01;

public class MTest04 {

	public static void main(String[] args) {
		//1����10���������� ���ڸ������ϴ¹迭�� ������
		//�״����� �� �迭�ȿ��ִ� ��� ���� ���ؼ� �������
		//int a[]=new a[10];
//		
//		int[] a;
//		a=new int[10];
		//���� ���� �ʱ�ȭ
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
