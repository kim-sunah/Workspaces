package com.test05;

import java.util.Scanner;

public class Circle extends AreaImpl{
	
	@Override
	public void make() {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������� �Է����ּ���: ");
		int r=sc.nextInt();
		
		double res=Math.PI*r*r;;
		
		//super.setResult(String.valueOf(res));
		//super.setResult(Double.toString(res));
		super.setResult(res+"");		
	}
	
	@Override
	public void print() {
		System.out.println("����");
		super.print();
	}

}
