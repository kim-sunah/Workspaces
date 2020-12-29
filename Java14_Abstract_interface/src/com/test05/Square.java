package com.test05;

import java.util.Scanner;

public class Square extends AreaImpl{

	@Override
	public void make() {
		Scanner sc=new Scanner(System.in);
	}
	
	@Override
	public void print() {
		System.out.print("¿øÀÇ");
		super.print();
	}
}
