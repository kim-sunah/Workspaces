package com.test01;

import java.util.Vector;

public class MTest01 {

	public static void main(String[] args) {
		//Vector
		Vector<Integer>v= new Vector<Integer>(10,5);
		
		System.out.println(v.size()+" : "+v.capacity());
		//0:10
		v.add(1);
		System.out.println(v.size()+" : " + v.capacity());
		//1:10
		System.out.println(v);
		//[1]
		for(int i=2;i<10;i++) {
			v.add(i);
		}
		System.out.println(v.size()+" : "+v.capacity());
		//9:10
		System.out.println(v);
		//[1, 2, 3, 4, 5, 6, 7, 8, 9]
		v.add(10);
		System.out.println(v.size()+":"+v.capacity());
		//10:10
		System.out.println(v);
		//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		v.add(11);
		System.out.println(v.size()+" : "+v.capacity() );
		//11:15
		System.out.println(v);
		//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
	}
}
