package com.test03;

public class MTest {

	public static void main(String[] args) {
		String name="�̵���";
		int kor=100;
		int eng=50;
		int math=74;
		
		// 1. Score Ŭ������ int�� ���� 3���� �޾Ƽ�, 
		// �� ���� ����� double�� �����ϴ� getAvg ��� �޼ҵ带 ������.
		// ���������ڴ� public, �޸𸮿����� non-static
		
		// 2. Score Ŭ������ double�� ���� 1��(���)�� �޾Ƽ�,
		// 90 ~ 100 ������ "A"
		// 80 ~ 89 "B"
		// 70 ~ 79 "C"
		// 60 ~ 69 "D"
		// 0  ~ 59 "F"
		// �� �����ϴ� �޼ҵ带 ������.
		// �޼ҵ� �̸��� getGrade, ���������ڴ� ���� ��Ű�� ������,
		// �޸𸮿����� non-static
		
		// 3. MTest Ŭ������ main �޼ҵ忡�� 
		// �ڱ��̸�+���� �����+(A~F = getGrade���� ������ ��)+ �Դϴ�.
		
		// Class ���� = new Class();
		Score my =new Score();
		// ����.method
		//double avg = my.getAvg(kor, eng, math);
		//String grade = my.getGrade(avg);
		//System.out.println(name + "���� ����� " + grade +"�Դϴ�.");
		System.out.println(name+"���� �����"+my.getGrade(my.getAvg(kor,eng, math))+"�Դϴ�.");
	}

}
