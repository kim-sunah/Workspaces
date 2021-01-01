package com.test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MTest01 {
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		//부모타입으로 자식객체를 선언했다=다형성
		//List 순서O,중복O
		list.add("홍길동");
		list.add("이순신");
		list.add("김선달");
		list.add("조세호");
		list.add("강호동");
		list.add("유재석");
		list.add("신동엽");
		list.add("조세호");
		
		System.out.println(list);
		System.out.println(list.get(2));
		//prn(list);
		//transElement(list);
		Set<String>myset=new HashSet<String>();
		//Set순서X,중복X
		myset.add("홍길동");
		myset.add("이순신");
		myset.add("김선달");
		myset.add("홍길동");
		
		System.out.println(myset);
		//방법1
		Object[]setArray= myset.toArray();
		for(Object o:setArray) {
			System.out.println(o);
		}
		for(int i=0;i<setArray.length;i++) {
			System.out.println(setArray[i]);
		}
		
		//방법2
		Iterator<String>setiterator= myset.iterator();
		while(setiterator.hasNext()) {
			System.out.println(setiterator.next());
		}
		
		
		
		Map<Integer, String>mymap=new HashMap<Integer, String>();
		
		
		mymap.put(1, "syyo");
		mymap.put(2, "kageyama");
		mymap.put(10, "hinata");
		mymap.put(5, "sunah");
		mymap.put(5, "syyo");
		System.out.println(mymap);
		
		System.out.println(mymap.get(1));
		
	}
	//{d,d,d,....d}
	private static void prn(List<String>list) {
		System.out.print("{");
		for(int i=0;i<list.size();i++) {
			if(i==list.size()-1) {
				System.out.printf("%s",list.get(i));
			}else {
				System.out.printf("%s,\t",list.get(i));
			}
		}
		System.out.println("}");
		
	}
	
	public static void transElement(List<String>list) {
		//1.홍길동을 김길동으로 바꾸자
		list.set(list.indexOf("홍길동"), "김길동");
		System.out.println(list);
		
		//2."~신"으로 끝나는 객체를 찾아서
		//만일 있다면 "~자"로 바꾸자
		for(int i=0;i<list.size();i++) {
			if(list.get(i).endsWith("신")) {
				list.set(i,list.get(i).replace("신", "자"));
			}
		}
		System.out.println(list);
		
		//3. 끝 글자가 "호"인 이름을 찾아서 삭제하자
		for(int i=0;i<list.size();i++) {
			if(list.get(i).endsWith("호")) {
				list.remove(i);
			}
		}
	}

}
