package com.test03;

public class MTest {

	/*
	 * System.out.print(값):출력, 줄바꿈X
	 * System.out print(값):출력, 줄바꿈 O
	 * System.out.print(format.값) : format에 맞춰 출력, 줄바꿈X
	 * 	format:java.util.Formatter
	 */
	public static void main(String[] args) {
		int i=100;
		System.out.print("1.i="+i);		//100
		System.out.println("2.i="+i);	//100
		System.out.printf("3.i=%d",i);	//100
		System.out.print("\t 4. \n");	//아무것도 안나옴
		System.out.println("--------");
		
		/*
		 * 시험점수 결과는 100(su)점이고, 학점은 'A(ch)'가 나왔다.
		 * 나의 오늘 감정지수는 90.50(d)%이다.
		 */
		
		int su=100;
		char ch='A';
		double d=90.50d;
		System.out.printf("시험점수 결과는 %10d 점이고, 학점은'%3c'가 나왔다."
				+ "\n 나의 오늘 감정지수는 %.2f%%이다",su,ch,d);
		
		
		
	}
}
