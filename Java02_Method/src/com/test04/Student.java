package com.test04;

public class Student {

	//main method:프로그램의 주 진입점
	public static void main(String[] args) {
		int kor, eng, math;
		kor=eng=math=0;	//이거 뭘까요?

		kor=100;
		eng=40;
		math=71;
		
		// 1번과 2번에서 만든 메소드를 활용하여
		// 총점과 평균을 출력하자.
		int sum;	//sum이라는 변수를 선언! 타입은 int 다.
		double avg=0;
		
		sum=0;	//sum이라는 변수를 초기화
		
		sum=getSum(kor,eng,math);
		//avg=getAvg(sum);
		avg=getAvg(getSum(kor,eng,math));
		
		System.out.println("총합"+sum);
		System.out.println("평균"+avg);
	}
	
	// 1. int형 값 3개를 넣어주면, 3개 값의 int형 총점을 리턴해주는
	// getSum 이라는 메서드를 만들자.
	// 접근제한은 같은 패키지 내에서만 가능,
	// 메모리는 static 영역에 저장된다.
	
	// 접근제한자 메모리영역 리턴타입 메소드이름 (파라미터){}
	static int getSum(int kor, int eng, int math) {
		return (kor+eng+math);
	}
	// 2. int형 값 1개를 넣어주면, 해당 값의 1/3을 실수로 리턴해주는
	// getAvg 라는 메서드를 만들자.
	// 어디서나 접근/참조 가능하고,
	// 메모리는 static 영역에 저장된다.
	public static double getAvg(int sum) {
		return(double)sum/3;
	}
}
