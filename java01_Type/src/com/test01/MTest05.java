package com.test01;

public class MTest05 {
	/*
	 * �⺻Ÿ��		����Ÿ��
	 * 1.byte		Byte
	 * 2.short		Short
	 * 3.int 		Integer
	 * 4.long		Long
	 * 
	 * 5.float		Float
	 * 6.double		Double
	 * 
	 * 7.char		Character
	 * 
	 * 8.boolean	Boolean
	 */
	public static void main(String[] args) {
		System.out.println("Byte�� ����"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		//Byte�� ����-128~127
		
		System.out.println("Short�� ����"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		//Short�� ����-32768~32767
		
		System.out.println("Integer�� ����"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		//Integer�� ����-2147483648~2147483647
		
		System.out.println("Long�� ����"+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		//Long�� ����-9223372036854775808~9223372036854775807
		
		System.out.println("Float�� ����"+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		//Float�� ����1.4E-45~3.4028235E38
		
		System.out.println("Double�� ����"+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		//Double�� ����4.9E-324~1.7976931348623157E308
		
		System.out.println("Character�� ũ��"+Character.SIZE);
		//Character�� ũ��16
		
		System.out.println(Boolean.TRUE);
		//true
	
	

	}
}
