package com.test02;

public class MTest01 {
	public static void main(String[] args) {
		stringBufferTest();
		//stringTest();
	}
	
	//String 
	public static void stringTest() {
		// java�� ���������� +���� �� StringBuilder�� ����Ѵ�.(1.5 ����)
		String s="�ȳ��ϼ���";
		s +="�� �̸���";
		s+="�̵����Դϴ�.";
		System.out.println(s);				//�ȳ��ϼ��� �� �̸��� �̵����Դϴ�.
		System.out.println(s.hashCode());	//�ּҰ�
		
		//immutable
		s.replace("�ȳ��ϼ���", "����");			
		System.out.println(s);				//�ȳ��ϼ����� �̸����̵����Դϴ�.
		s=s.replace("�ȳ��ϼ���", "����");
		System.out.println(s);				//������ �̸����̵����Դϴ�.
		System.out.println(s.hashCode());	//�ּҰ�
	}
	
	//StringBuffer
	public static void stringBufferTest() {
		StringBuffer sb=new StringBuffer();
		sb.append("�ȳ��ϼ���")
		.append("�� �̸���")
		.append("�̵����Դϴ�.");
		System.out.println(sb);				//�ȳ��ϼ����� �̸����̵����Դϴ�.
		System.out.println(sb.hashCode());	// �ּҰ�
		// mutable
		sb.replace(0, 5, "����");				
		//���ڿ� ġȯ
		//0��° ���ں��� 5��° ���ڱ��� ����
		System.out.println(sb);				//������ �̸����̵����Դϴ�.
		System.out.println(sb.hashCode());	//�ּҰ�
		
		sb.reverse();						//�Ųٷ�
		System.out.println(sb);				//.�ٴ����嵿�������� ������
	}

}