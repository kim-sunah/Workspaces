package com.test01;

public class MethodTest01 {
	
	//class (���赵) : ���(method),�Ӽ�
	//���������� �޸𸮿��� ����Ÿ�� �޼ҵ��̸�(�Ķ����){���}
	
	public static void main(String[] args) {
		//static method�� ȣ���ϴ� ��� : Class.mthod();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		defaultMethod();
		privateMethod();
	}
	
	//���� ������:�޼ҵ带 ȣ���� �� �ִ� ������ �˷��ش�.
	
	//public
	public static void publicMethod() {
		System.out.println("public method");
		System.out.println("->��𼭳� ����, ���� ����(+)");
	}
	
	//protected
	protected static void protectedMethod() {
		System.out.println("protected method");
		System.out.println("->����� ���, ��ӵ� ������(#)");
		System.out.println("->����� �ƴ� ���, ���� ��Ű�� ������");
	}
	
	//(default)
	static void defaultMethod() {
		System.out.println("default method");
		System.out.println("->���� ��Ű�� ������(~)");
	}
	
	//private
	private static void privateMethod() {
		System.out.println("private method");
		System.out.println("-> ���� Ŭ���� ��������(~)");
	}
	
	//(non-static)
	public void nonStaticMethod() {
		System.out.println("non static method");
		System.out.println("��ü�� ���� ȣ��");
	}
	
	
}
