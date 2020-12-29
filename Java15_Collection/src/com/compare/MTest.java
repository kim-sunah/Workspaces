package com.compare;

import java.util.Arrays;

public class MTest {
	
	public static void main(String[] args) {
		// Score type의 값 3개를 저장할 수 있는
		// student라는 배열을 만들고, 자기 자신과 양쪽 짝궁 객체를 만들어서
		// 해당 배열에 저장하자.
		Score[] student=new Score[3];
		student[0]=new Score("홍길동",100,70,68);
		student[1]=new Score("이순신",77,90,88);
		student[2]=new Score("김선아",100,80,100);
		
		for(Score score:student) {
			System.out.println(score);
		}
		
		Arrays.sort(student);
		System.out.println("----------------");
		for(Score score:student) {
			System.out.println(score);
		}
		//정렬
		int[] arr= {1,5,3,4,2};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
