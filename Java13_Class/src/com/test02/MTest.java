package com.test02;

public class MTest {

	public static void main(String[] args) {
		/*
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.bark();
		dog.bark();
		*/
		
		Animal someone=new Dog();
		someone.bark();
		someone=new Cat();
		someone.bark();
		
		//instanceof
		if(someone instanceof Dog) {
			System.out.println("�۸��̴�!!");
		}else if(someone instanceof Cat) {
			System.out.println("�Ŀ��̴�!!");
		}
	}
}
/*
������
1. �θ�Ÿ������ �ڽ� ��ü ����
Parent p = new Child();

2. �θ�Ÿ�� ������ �ڽ� Ÿ�� ���� ����
Child c = new Child();
Parent p = c;

3. �θ��� �޼��带 ���� �ڽ� �޼��尡 ȣ��

* ���� �θ� ������ �ִ� �ڽ�Ŭ������, �����Ͻ� �� ��ȯ ����������
��Ÿ�ӽ� ClassCastException�� �߻���Ų��.
*/
