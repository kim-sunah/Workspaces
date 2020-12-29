package com.test02;

public class MTest {
	
	public static void main(String[] args) {
		/*
		 * 1. com.test02 패키지 내에 Season 이라는 클래스를 만들자.
		 * 
		 * 2. Season 클래스 내에 prn() 이라는 메소드를 만들자.
		 *    prn 메소드는 어디서나 접근 가능하고, non-static 메소드이며,
		 *    문자열을 리턴하는 메소드이다.
		 *    파라미터로는 정수형 값 1개를 받는다.
		 * 
		 * 3. prn 메소드 내에서
		 *    파라미터로 전달된 값이 
		 *    12, 1, 2 라면 "겨울" 을 리턴
		 *    3, 4, 5 라면 "봄" 리턴
		 *    6, 7, 8 이라면 "여름" 리턴
		 *    9, 10, 11 이라면 "가을" 리턴
		 *    하자.
		 *    단! switch를 사용하자.
		 * 
		 * 4. MTest 클래스의 main 메소드에서
		 *    Season 클래스의 prn 메소드를 호출해서 리턴받은 값을 사용하여
		 *    자신의 생일(월)을 입력하면
		 *    "나의 생일은 XX 입니다." 가 출력되도록 하자.
		 *    XX : Season 클래스의 prn 메소드가 리턴해준 값.
		 */
		
		Season sa=new Season();
		
		//String res=sa.prn(6);
		
		System.out.println("나의 생일은"+sa.prn(1)+"입니다.");
	}

}
