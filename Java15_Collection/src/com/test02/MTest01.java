package com.test02;

import java.util.ArrayList;
import java.util.List;

public class MTest01 {
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("�̼���");
		list.add("�輱��");
		list.add("����ȣ");
		list.add("��ȣ��");
		list.add("���缮");
		list.add("�ŵ���");
		list.add("����ȣ");
		
		System.out.println(list);
		prn(list);
		transElement(list);
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
