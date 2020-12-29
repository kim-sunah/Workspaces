package com.test03;

import java.util.HashSet;
import java.util.Set;

public class MTest01 {
	
	public static void main(String[] args) {
		Set<String>set=new HashSet<String>();
		set.add("1");
		set.add("5");
		set.add("2");
		set.add("4");
		set.add("3");
		set.add("6");
		set.add("7");
		set.add("1");
		//set.add(null): //값으로 저장은 되지만, 사용시 NullPonterException발생
		
		for(String s:set) {
			System.out.println(s);
		}
		findSet(set,"1");
		deleteSet(set,"3");
		System.out.println(set);
	}
	public static void deleteSet(Set<String>set, String delete) {
		for (String s:set) {
			if(s.equals(delete)) {
				set.remove(s);
				break;
			}
		}
	}
	public static void findSet(Set<String>set,String find) {
		for(String s:set) {
			if(s.equals(find)) {
				System.out.println(s+"찾았다!");
			}
		}
	}

}
