package com.compare;

import java.util.Arrays;

public class MTest {
	
	public static void main(String[] args) {
		// Score type�� �� 3���� ������ �� �ִ�
		// student��� �迭�� �����, �ڱ� �ڽŰ� ���� ¦�� ��ü�� ����
		// �ش� �迭�� ��������.
		Score[] student=new Score[3];
		student[0]=new Score("ȫ�浿",100,70,68);
		student[1]=new Score("�̼���",77,90,88);
		student[2]=new Score("�輱��",100,80,100);
		
		for(Score score:student) {		//��  : �̰� �����
			//���ھ�:��Ʃ��Ʈ
			System.out.println(score);
		}
		
		Arrays.sort(student);
		System.out.println("----------------");
		for(Score score:student) {
			System.out.println(score);
		}
		//����
		int[] arr= {1,5,3,4,2};
		System.out.println(Arrays.toString(arr));
		//[1, 5, 3, 4, 2]
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//[1, 2, 3, 4, 5]
	}

}
