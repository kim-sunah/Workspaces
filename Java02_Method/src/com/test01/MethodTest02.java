package com.test01;

public class MethodTest02 {
	
	public static void main(String[] args) {
		//static method ȣ����: Class.method();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod():
		//private:�ش� Ŭ���� �������� 
		
		//(non-static)methodȣ����
		//type����=new type();	class����=new class();
		///����.methodq		user.method();
		
		// (non-static) method ȣ�� ���
		// type ���� = new type();		class ���� = new class();
		// ����.method();				����.method();
		MethodTest01 method01 = new MethodTest01();
		method01.nonStaticMethod();
		
		// UML : Unified Modeling Language
		// http://www.objectaid.com
	}

}
