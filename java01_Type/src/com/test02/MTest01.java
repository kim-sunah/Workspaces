package com.test02;

public class MTest01 {
	public static void main(String[] args) {
		//������ �� ��ȯ upCasting(promotion) : ����Ÿ��-> ū Ÿ��
		byte b01=(byte)100;
		int i01=b01;
		System.out.println(i01);	//100
		
		//������ ����ȯ downCasting(casting):ūŸ�� -> ����Ÿ��
		int i02=100;
		byte b02=(byte)i02;
		System.out.println(b02);	//100
	}

}