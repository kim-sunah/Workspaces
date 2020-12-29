package com.test01;

public class MTest05 {
	/*
	 * 기본타입		참조타입
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
		System.out.println("Byte의 범위"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		//Byte의 범위-128~127
		
		System.out.println("Short의 범위"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		//Short의 범위-32768~32767
		
		System.out.println("Integer의 범위"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		//Integer의 범위-2147483648~2147483647
		
		System.out.println("Long의 범위"+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		//Long의 범위-9223372036854775808~9223372036854775807
		
		System.out.println("Float의 범위"+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		//Float의 범위1.4E-45~3.4028235E38
		
		System.out.println("Double의 범위"+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		//Double의 범위4.9E-324~1.7976931348623157E308
		
		System.out.println("Character의 크기"+Character.SIZE);
		//Character의 크기16
		
		System.out.println(Boolean.TRUE);
		//true
	
	

	}
}
