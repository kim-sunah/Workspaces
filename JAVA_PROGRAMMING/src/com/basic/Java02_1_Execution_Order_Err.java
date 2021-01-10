package com.basic;

public class Java02_1_Execution_Order_Err {
	
	public static void main(String[] args) {
		
		System.out.println("name");
		String name="김선아";
	}
	/*
	  	오류: com.basic.Execution_Order_Err02_1 클래스에서 기본 메소드를 찾을 수 없습니다. 다음 형식으로 기본 메소드를 정의하십시오.
   		public static void main(String[] args)	
		또는 JavaFX 애플리케이션 클래스는 javafx.application.Application을(를) 확장해야 합니다.
	 */
	//위에서 아래로 진행되기때문에 7번째 줄에서 name을 찾을수 없어서 나는 오류

}
