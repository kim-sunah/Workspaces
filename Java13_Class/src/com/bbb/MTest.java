package com.bbb;

import com.aaa.AAA;

public class MTest {
	
	public static void main(String[] args) {
		BBB b1=new BBB();
		b1.setAbc(1);
		b1.setB(2);
		System.out.println(b1.getSum());
		b1.prn();
		
		//BBB b2=new AAA();
		AAA b2=new BBB();
		b2.prn();
		BBB b3=new BBB(4,5);
		System.out.println(b3.getSum());
	}

}
