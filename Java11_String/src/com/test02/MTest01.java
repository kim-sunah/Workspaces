package com.test02;

public class MTest01 {
	public static void main(String[] args) {
		stringBufferTest();
		//stringTest();
	}
	
	//String 
	public static void stringTest() {
		// java는 내부적으로 +연산 시 StringBuilder를 사용한다.(1.5 이후)
		String s="안녕하세요";
		s +="제 이름은";
		s+="이동헌입니다.";
		System.out.println(s);				//안녕하세요 제 이름은 이동헌입니다.
		System.out.println(s.hashCode());	//주소값
		
		//immutable
		s.replace("안녕하세요", "하이");			
		System.out.println(s);				//안녕하세요제 이름은이동헌입니다.
		s=s.replace("안녕하세요", "하이");
		System.out.println(s);				//하이제 이름은이동헌입니다.
		System.out.println(s.hashCode());	//주소값
	}
	
	//StringBuffer
	public static void stringBufferTest() {
		StringBuffer sb=new StringBuffer();
		sb.append("안녕하세요")
		.append("제 이름은")
		.append("이동헌입니다.");
		System.out.println(sb);				//안녕하세요제 이름은이동헌입니다.
		System.out.println(sb.hashCode());	// 주소값
		// mutable
		sb.replace(0, 5, "하이");				
		//문자열 치환
		//0번째 문자부터 5번째 문자까지 변경
		System.out.println(sb);				//하이제 이름은이동헌입니다.
		System.out.println(sb.hashCode());	//주소값
		
		sb.reverse();						//거꾸로
		System.out.println(sb);				//.다니입헌동이은름이 제이하
	}

}
