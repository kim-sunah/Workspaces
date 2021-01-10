package com.basic;

public class Java03_1_ProgramRunRangeErr {

	public static void main(String[] args) {
		//메인메소드
		
		String name="김선아";
		System.out.println(name);
		print();
	}
	public static void print() {
		//print메소드
		
		System.out.println(name);
	}
	/*
	 	오류: com.basic.ProgramRunRange03 클래스에서 기본 메소드를 찾을 수 없습니다. 다음 형식으로 기본 메소드를 정의하십시오.
  		public static void main(String[] args)
		또는 JavaFX 애플리케이션 클래스는 javafx.application.Application을(를) 확장해야 합니다.
	 */
	
	//이미 name을 main()메소드2번째줄 실행범위 안에 있기 때문에 print()ㅔ모스에서 사용할 수 없다.
}
