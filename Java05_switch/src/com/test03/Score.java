package com.test03;

public class Score {
	//���������� �޸𸮿��� ����Ÿ�� �̸�(�Ķ����/�ƱԸ�Ʈ){}
	public double getAvg(int kor, int eng, int math) {
		double avg=0;
		
		avg=(double)(kor+eng+math)/3;
		
		return avg;
	}
	
	String getGrade(double avg) {
		/*
		if (avg >= 90) {
			return "A";
		} else if (avg >= 80) {
			return "B";
		} else if (avg >= 70) {
			return "C";
		} else if (avg >= 60) {
			return "D";
		}
		*/
		switch((int)avg/10) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		}
		return "F";
	}

}
