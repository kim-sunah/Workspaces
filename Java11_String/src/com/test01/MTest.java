package com.test01;

public class MTest {

	static String str="The String class representes character strings.";
	
	public static void main(String[] args) {
		String s="hello";
		System.out.println(1+2+s);	//3hello
		System.out.println(s);		//hello
		System.out.println(s+1+2);	//hello12
		s=1+2+s;
		s=s+1+2+"!";
		System.out.println(s); 		//3hello12!
				
		// 1.str의 길이
		//length
		test01();	//46
		
		// 2.str전체 대문자로 바꾸자.(바꿔서 출력)
		//toUpperCase
		test02();	//THE STRING CLASS REPRESENTS CHARACTER STRINGS.
		
		// 3.str전체 소문자로 
		//toLowerCase
		test03();	//the string class represents character strings.
		
		// 4.str에서 첫번째 'c'의 인덱스 위치
		//indexOf
		test04();	//11
		
		// 5.'class'를 'java'로 바꿔서 전체 출력
		//replace
		test05();
		
		// 6.'character'를 찾아서 대문자로 변환 후, 전체 출력
		//indexOf
		test06();
		
		// 7.str을 char[]로 출력하되, 'c'만 출력
		// 그리고 c의 갯수 출력
		test07();
		
		// 8.str을 char[]로 출력하되, 대문자만 출력
		// 그리고 대문자의 갯수 출력
		test08();
		
		// 9.모든 공백 제거 후 출력
		test09();
		
		// 10.전체 역순으로 출력
		test10();
	}
	public static void test10() {
		for(int i=str.length();i>0;i--) {
			System.out.println(str.charAt(i-1));
		}
	}
	
	private static void test09() {
		System.out.println(str.trim());
		System.out.println(str.replace(" ", ""));
		System.out.println(str.replaceAll(" ", ""));
		System.out.println(str.replaceFirst(" ", ""));
	}

	private static void test08() {
		char[] arr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Character.isUpperCase(arr[i])) {
				System.out.print(arr[i]);
				count++;
			}
		}
		System.out.println("\n대문자의 갯수 : " + count);
	}

	private static void test07() {
		char[] arr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Character.toLowerCase(arr[i]) == 'c') {    
			// if (arr[i] == 'c' || arr[i] == 'C') {
				System.out.print(arr[i]);
				count++;
			}
		}
		System.out.println("\nc의 갯수 : " + count);
	}
	
	private static void test06() {
		String target = "character";
		int startIdx = str.indexOf(target);
		int endIdx = startIdx + target.length();
		String upperTarget = str.substring(startIdx, endIdx).toUpperCase();
		System.out.println(str.replace(target, upperTarget));
	}
	private static void test05() {
		System.out.println(str.replace("class", "java"));
	}

	private static void test04() {
		System.out.println(str.indexOf('c'));
	}

	private static void test03() {
		System.out.println(str.toLowerCase());
	}

	private static void test02() {
		System.out.println(str.toUpperCase());
	}



	private static void test01() {
		System.out.println(str.length());
	}
}
