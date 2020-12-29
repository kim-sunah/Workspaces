package com.singletion;

//메모리(Heap)에 객체를 한번만 생성
public class Singletion {
	
	//2.객체를 확인할 주소(reference)값 저장할 필드
	private static Singletion singletion;
	
	//1.생성자를 private으로 만든다. (외부에서 생성 불가)
	private Singletion() {
		System.out.println("singletion생성");
	}
	//3. 객체 생성 메서드
	public static Singletion getInstance() {
		//만일 heap영역에 객체가 없으면 객체 생성
		if(singletion==null) {
			singletion=new Singletion();
		}
		
		//singletion객체의 주소값 리턴
		return singletion;
	}
	

}
