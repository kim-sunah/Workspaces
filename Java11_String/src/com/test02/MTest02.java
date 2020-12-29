package com.test02;

import java.util.StringTokenizer;

public class MTest02 {
	
	public static void main(String[] args) {
		String str = "The,String,class,represents";
		
		//1.
		System.out.println(str.substring(4,10));
		//String
		
		//2.
		String[] splitArr=str.split(",");
		for(int i=0; i<splitArr.length;i++) {
			System.out.println(splitArr[i]);
			/*
			 * 	The
				String
				class
				represents
			 */
		}
		
		//3.
		String str2 = "The_String_class,represents";
		StringTokenizer st=new StringTokenizer(str2,"_");
		while(st.hasMoreElements()) {
			//hasMoreElements=커서 앞에 데이터가 들어있는지를 체크
			//현재 커서가 0이라면 첫번째 칸을 가리키기 때문에 데이터가 하나라도 들어있다면 true를 리턴해줍니다.
			System.out.println(st.nextElement());
		}
	}

}
