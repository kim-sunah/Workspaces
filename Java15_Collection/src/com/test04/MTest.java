package com.test04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MTest {

	public static void main(String[] args) {
		//Map<K,V>k:key, v:value
		Map<Integer,String>map=new HashMap<Integer,String>();
		
		for (int i=111; i<116;i++) {
			map.put(i, i+"abc");
		}
		System.out.println(map);
		map.put(112, "abc112");
		System.out.println(map);
		map.put(112, "113abc");
		System.out.println(map);
		printMap(map);
	}
	
	public static void printMap(Map<Integer, String>map) {
		Collection<String>strValues=map.values();
		System.out.println(strValues);
		Set<Integer>intKeys=map.keySet();
		System.out.println(intKeys);
		
		Set<Map.Entry<Integer, String>>entrySet=map.entrySet();
		//Map.Entry:K�� V�� �����ϴ� Ŭ����
		//Map:K->V/Entry:K|V
		for (Entry<Integer,String>entry:entrySet) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		Iterator<Map.Entry<Integer,String>>ir=entrySet.iterator();
			//value�� 115abc�� key���� ã�Ƽ�, �ش� key���� �������.
		while(ir.hasNext()) {
			//ir�ȿ� �ִ� Entry���� �����ͼ�
			//Entry�ȿ� �մ� value�� �����ͼ� 115abc�� ���ؼ�
			//�ش� key���� ���
			Entry<Integer,String>entry=ir.next();
			if(entry.getValue().equals("115")){
				System.out.println(entry.getKey());
			}
		}
	}
}
