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
		//Map.Entry:K와 V를 관리하는 클래스
		//Map:K->V/Entry:K|V
		for (Entry<Integer,String>entry:entrySet) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		Iterator<Map.Entry<Integer,String>>ir=entrySet.iterator();
			//value가 115abc인 key값을 찾아서, 해당 key값을 출력하자.
		while(ir.hasNext()) {
			//ir안에 있는 Entry값을 가져와서
			//Entry안에 잇는 value를 가져와서 115abc와 비교해서
			//해당 key값을 출력
			Entry<Integer,String>entry=ir.next();
			if(entry.getValue().equals("115")){
				System.out.println(entry.getKey());
			}
		}
	}
}
