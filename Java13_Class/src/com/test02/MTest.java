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
			System.out.println("멍멍이다!!");
		}else if(someone instanceof Cat) {
			System.out.println("냐옹이다!!");
		}
	}
}
/*
다형성
1. 부모타입으로 자식 객체 생성
Parent p = new Child();

2. 부모타입 변수에 자식 타입 변수 대입
Child c = new Child();
Parent p = c;

3. 부모의 메서드를 통해 자식 메서드가 호출

* 같은 부모를 가지고 있는 자식클래스는, 컴파일시 형 변환 가능하지만
런타임시 ClassCastException을 발생시킨다.
*/
