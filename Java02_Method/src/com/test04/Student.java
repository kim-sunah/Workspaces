package com.test04;

public class Student {

	//main method:���α׷��� �� ������
	public static void main(String[] args) {
		int kor, eng, math;
		kor=eng=math=0;	//�̰� �����?

		kor=100;
		eng=40;
		math=71;
		
		// 1���� 2������ ���� �޼ҵ带 Ȱ���Ͽ�
		// ������ ����� �������.
		int sum;	//sum�̶�� ������ ����! Ÿ���� int ��.
		double avg=0;
		
		sum=0;	//sum�̶�� ������ �ʱ�ȭ
		
		sum=getSum(kor,eng,math);
		//avg=getAvg(sum);
		avg=getAvg(getSum(kor,eng,math));
		
		System.out.println("����"+sum);
		System.out.println("���"+avg);
	}
	
	// 1. int�� �� 3���� �־��ָ�, 3�� ���� int�� ������ �������ִ�
	// getSum �̶�� �޼��带 ������.
	// ���������� ���� ��Ű�� �������� ����,
	// �޸𸮴� static ������ ����ȴ�.
	
	// ���������� �޸𸮿��� ����Ÿ�� �޼ҵ��̸� (�Ķ����){}
	static int getSum(int kor, int eng, int math) {
		return (kor+eng+math);
	}
	// 2. int�� �� 1���� �־��ָ�, �ش� ���� 1/3�� �Ǽ��� �������ִ�
	// getAvg ��� �޼��带 ������.
	// ��𼭳� ����/���� �����ϰ�,
	// �޸𸮴� static ������ ����ȴ�.
	public static double getAvg(int sum) {
		return(double)sum/3;
	}
}
