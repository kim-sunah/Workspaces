package com.test02;

public class Season {
	
	//static String result=null;
	public String prn(int month) {
		//String result=null;
		switch(month) {
		case 12:
		case 1:
		case 2:
			//result="겨울"
			//System.out.println("겨울");
			//break:
			return "겨울";
		case 3: case 4: case 5:
			return "봄";
		case 6:
		case 7:
		case 8:
			return "여름";
		case 9:
		case 10:
		case 11:
			return "가을";
		default:
			return "";
		}
		
		//return null;
		//return result;
	}

}
