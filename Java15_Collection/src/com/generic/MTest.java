package com.generic;

public class MTest {
	public static void main(String[] args) {
		Emp samsong=new Emp("s001","È«±æµ¿");
		Emp lj=new Emp(1111,"±è¼±´Þ");
		System.out.println(samsong);
		System.out.println(lj);
		lj.setEmpno("l1111");
		System.out.println(lj);
		
		Emp<String>cacao=new Emp<String>("k0001","¶óÀÌ¾ð");
		System.out.println(cacao);
	}

}
