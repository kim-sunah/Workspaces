package com.test01;

import java.util.Vector;

public class MTest02 {

	public static void main(String[] args) {
		Vector<String>v=new Vector<String>();
		v.add("홍길동");
		v.add("이순신");
		v.add("김선달");
		v.add("강호동");
		v.add("유재석");
		v.add("신동엽");
		v.add("조세호");
		
		prn(v);
		transElement(v);
		
	}
	
	private static void prn(Vector<String>v) {
		System.out.print("{");
		for (String s:v) {
			System.out.print(s+"\t");
		}
		System.out.println("}");
	}
	
	private static void transElement(Vector<String>v) {
		//홍길동의 인덱스를 찾아서 v의 값을 홍길순으로 바꾸자
		v.set(v.indexOf("홍길동"), "홍길순");
		System.out.println(v);
		
		//2."~신"으로 끝나는 객체를 찾아서
		//만일 있다면, "신"을 "자"로 바꾸자
		for(int i=0;i<v.size();i++) {
			if(v.get(i).endsWith("신")) {
				v.set(i, v.get(i).replace("신", "자"));
			}
		}
		System.out.println(v);
		
		//3.마지막 글자가 "호"인 이름을 찾아서,
		//만일 있다면, 삭제하자
		for(String s:v) {
			if(s.endsWith("호")) {
				
			}
		}
		for (int i=0;i<v.size();i++) {
			if(v.get(i).endsWith("호")) {
				v.remove(v.get(i));
			}
		}
		System.out.println(v);
		
	}
}
