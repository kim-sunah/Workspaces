package com.test03;

public class MTest {
	public static void main(String[] args) {
		int sumValue=MyCalc.mySum(10,3);
		System.out.println(sumValue);	//13
		
		//MyCalc클래스에 있는
		// mySub 메소드를 호출
		// 10이라는 값과, 3 이라는 값을 전달
		MyCalc.mySub(10, 3);	//7
		
		// MyCalc 클래스에 있는 myMul 메소드를 호출
		MyCalc my=new MyCalc();	//30.0
		//10,3을 전달
		double mul=my.myMul(10.0, 3.0);
		System.out.println(mul);	//10/3의 몫:3
		
		MyCalc.myDiv(10, 3);	//10%3의 나머지: 1
	}
}
