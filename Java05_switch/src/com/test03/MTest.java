package com.test03;

public class MTest {

	public static void main(String[] args) {
		String name="이동헌";
		int kor=100;
		int eng=50;
		int math=74;
		
		// 1. Score 클래스에 int형 정수 3개를 받아서, 
		// 세 값의 평균을 double로 리턴하는 getAvg 라는 메소드를 만들자.
		// 접근제한자는 public, 메모리영역은 non-static
		
		// 2. Score 클래스에 double형 정수 1개(평균)을 받아서,
		// 90 ~ 100 까지는 "A"
		// 80 ~ 89 "B"
		// 70 ~ 79 "C"
		// 60 ~ 69 "D"
		// 0  ~ 59 "F"
		// 를 리턴하는 메소드를 만들자.
		// 메소드 이름은 getGrade, 접근제한자는 같은 패키지 내에서,
		// 메모리영역은 non-static
		
		// 3. MTest 클래스의 main 메소드에서 
		// 자기이름+님의 등급은+(A~F = getGrade에서 리턴한 값)+ 입니다.
		
		// Class 변수 = new Class();
		Score my =new Score();
		// 변수.method
		//double avg = my.getAvg(kor, eng, math);
		//String grade = my.getGrade(avg);
		//System.out.println(name + "님의 등급은 " + grade +"입니다.");
		System.out.println(name+"님의 등급은"+my.getGrade(my.getAvg(kor,eng, math))+"입니다.");
	}

}
