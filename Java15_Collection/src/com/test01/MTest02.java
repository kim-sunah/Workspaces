package com.test01;

import java.util.Vector;

public class MTest02 {

	public static void main(String[] args) {
		Vector<String>v=new Vector<String>();
		v.add("ȫ�浿");
		v.add("�̼���");
		v.add("�輱��");
		v.add("��ȣ��");
		v.add("���缮");
		v.add("�ŵ���");
		v.add("����ȣ");
		
		prn(v);
		transElement(v);
		
	}
	
	private static void prn(Vector<String>v) {
		System.out.print("{");
		for (String s:v) {
			System.out.print(s+"\t");
		}
		System.out.println("}");
	}
	
	private static void transElement(Vector<String>v) {
		//ȫ�浿�� �ε����� ã�Ƽ� v�� ���� ȫ������� �ٲ���
		v.set(v.indexOf("ȫ�浿"), "ȫ���");
		System.out.println(v);
		
		//2."~��"���� ������ ��ü�� ã�Ƽ�
		//���� �ִٸ�, "��"�� "��"�� �ٲ���
		for(int i=0;i<v.size();i++) {
			if(v.get(i).endsWith("��")) {
				v.set(i, v.get(i).replace("��", "��"));
			}
		}
		System.out.println(v);
		
		//3.������ ���ڰ� "ȣ"�� �̸��� ã�Ƽ�,
		//���� �ִٸ�, ��������
		for(String s:v) {
			if(s.endsWith("ȣ")) {
				
			}
		}
		for (int i=0;i<v.size();i++) {
			if(v.get(i).endsWith("ȣ")) {
				v.remove(v.get(i));
			}
		}
		System.out.println(v);
		
	}
}
