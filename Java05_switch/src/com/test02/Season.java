package com.test02;

public class Season {
	
	//static String result=null;
	public String prn(int month) {
		//String result=null;
		switch(month) {
		case 12:
		case 1:
		case 2:
			//result="�ܿ�"
			//System.out.println("�ܿ�");
			//break:
			return "�ܿ�";
		case 3: case 4: case 5:
			return "��";
		case 6:
		case 7:
		case 8:
			return "����";
		case 9:
		case 10:
		case 11:
			return "����";
		default:
			return "";
		}
		
		//return null;
		//return result;
	}

}
