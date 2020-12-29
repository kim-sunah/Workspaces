package com.test02;

import com.test01.MethodTest01;

public class MethodTest03 {

	public static void main(String[] args) {
		MethodTest01.publicMethod();
		/*
		 * public method ->어디서나 접근, 참조 가능(+)
		 */
		// MethodTest01.protectedMethod(); //같은 패키지 내에서
		// MethodTest01.defaultMethod(); //같은 패키지 내에서
		// MethodTest01.privateMethod(); //같은 클래스 내에서만
	}

}
