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
			//hasMoreElements=Ŀ�� �տ� �����Ͱ� ����ִ����� üũ
			//���� Ŀ���� 0�̶�� ù��° ĭ�� ����Ű�� ������ �����Ͱ� �ϳ��� ����ִٸ� true�� �������ݴϴ�.
			System.out.println(st.nextElement());
		}
	}

}
