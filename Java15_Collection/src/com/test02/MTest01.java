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
		//�θ�Ÿ������ �ڽİ�ü�� �����ߴ�=������
		//List ����O,�ߺ�O
		list.add("ȫ�浿");
		list.add("�̼���");
		list.add("�輱��");
		list.add("����ȣ");
		list.add("��ȣ��");
		list.add("���缮");
		list.add("�ŵ���");
		list.add("����ȣ");
		
		System.out.println(list);
		System.out.println(list.get(2));
		//prn(list);
		//transElement(list);
		Set<String>myset=new HashSet<String>();
		//Set����X,�ߺ�X
		myset.add("ȫ�浿");
		myset.add("�̼���");
		myset.add("�輱��");
		myset.add("ȫ�浿");
		
		System.out.println(myset);
		//���1
		Object[]setArray= myset.toArray();
		for(Object o:setArray) {
			System.out.println(o);
		}
		for(int i=0;i<setArray.length;i++) {
			System.out.println(setArray[i]);
		}
		
		//���2
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
		//1.ȫ�浿�� ��浿���� �ٲ���
		list.set(list.indexOf("ȫ�浿"), "��浿");
		System.out.println(list);
		
		//2."~��"���� ������ ��ü�� ã�Ƽ�
		//���� �ִٸ� "~��"�� �ٲ���
		for(int i=0;i<list.size();i++) {
			if(list.get(i).endsWith("��")) {
				list.set(i,list.get(i).replace("��", "��"));
			}
		}
		System.out.println(list);
		
		//3. �� ���ڰ� "ȣ"�� �̸��� ã�Ƽ� ��������
		for(int i=0;i<list.size();i++) {
			if(list.get(i).endsWith("ȣ")) {
				list.remove(i);
			}
		}
	}

}
