package com.test03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.compare.Score;

public class MTest02 {
	public static void main(String[] args) {
		Score score1=new Score("홍길동",99,80,89);
		Score score2=new Score("이순신",100,65,85);
		Score score3=new Score("김선달",68,100,77);
		
		Set<Score>set=new HashSet<Score>();
		set.add(score1);
		set.add(score2);
		set.add(score3);
		
		printSet(set);
		
		//세번째 학생을 찾아서, 국어점수를 0점으로 바꾸자
		System.out.println(set);
		transElement(set);
		System.out.println(set);
	}
	public static void transElement(Set<Score>set) {
		Iterator<Score>ir=set.iterator();
		while(ir.hasNext()) {
			Score temp=ir.next();
			if(temp.getName().equals("이순신")) {
				temp.setKor(0);
			}
		}
	}
	//Set에서 값 가져오는 방법
	public static void printSet(Set<Score>set) {
		//1.
		/*
		 for(Score sc:set){
		 	System.out.println(sc);
		 }
		 */
		//2.
		/*
		Object[]arr=set.toArray();
		for(int i=0;i<arr.length; i++){
			System.out.println(arr[i]);
		}
		 */
		//3. Iterator: 컬렉션 저장 요소를 읽어오는 표준화된 방법
		Iterator<Score>ir=set.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
