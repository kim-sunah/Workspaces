package com.score;

public class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getSum() {
		//세 값의 평균
		return this.kor+this.eng+this.math;
	}
	public double getAvg() {
		//세 값의 평균
		return (double)getSum()/3;
	}
	public String getGrade() {
		// 100 ~ 90 : A
		//  89 ~ 80 : B
		//  79 ~ 70 : C
		//  69 ~ 60 : D
		//  59 ~    : F
		switch((int)getAvg()/10) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}
	}
	@Override
	public String toString() {
		return  "이름 : " + name + 
				"국어 : " + kor +
				"영어 : " + eng +
				"수학 : " + math + "\n" +
				"총점 : " + getSum() +
				"평균 : " + getAvg() +
				"등급 : " + getGrade();
	}
		
}

