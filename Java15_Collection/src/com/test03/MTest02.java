package com.test03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.compare.Score;

public class MTest02 {
	public static void main(String[] args) {
		Score score1=new Score("ȫ�浿",99,80,89);
		Score score2=new Score("�̼���",100,65,85);
		Score score3=new Score("�輱��",68,100,77);
		
		Set<Score>set=new HashSet<Score>();
		set.add(score1);
		set.add(score2);
		set.add(score3);
		
		printSet(set);
		
		//����° �л��� ã�Ƽ�, ���������� 0������ �ٲ���
		System.out.println(set);
		transElement(set);
		System.out.println(set);
	}
	public static void transElement(Set<Score>set) {
		Iterator<Score>ir=set.iterator();
		while(ir.hasNext()) {
			Score temp=ir.next();
			if(temp.getName().equals("�̼���")) {
				temp.setKor(0);
			}
		}
	}
	//Set���� �� �������� ���
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
		//3. Iterator: �÷��� ���� ��Ҹ� �о���� ǥ��ȭ�� ���
		Iterator<Score>ir=set.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
