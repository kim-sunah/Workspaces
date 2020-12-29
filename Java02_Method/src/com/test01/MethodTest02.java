package com.test01;

public class MethodTest02 {
	
	public static void main(String[] args) {
		//static method 호출방법: Class.method();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod():
		//private:해당 클래스 내에서만 
		
		//(non-static)method호출방법
		//type변수=new type();	class변수=new class();
		///변수.methodq		user.method();
		
		// (non-static) method 호출 방법
		// type 변수 = new type();		class 변수 = new class();
		// 변수.method();				변수.method();
		MethodTest01 method01 = new MethodTest01();
		method01.nonStaticMethod();
		
		// UML : Unified Modeling Language
		// http://www.objectaid.com
	}

}
