package com.singletion;

//�޸�(Heap)�� ��ü�� �ѹ��� ����
public class Singletion {
	
	//2.��ü�� Ȯ���� �ּ�(reference)�� ������ �ʵ�
	private static Singletion singletion;
	
	//1.�����ڸ� private���� �����. (�ܺο��� ���� �Ұ�)
	private Singletion() {
		System.out.println("singletion����");
	}
	//3. ��ü ���� �޼���
	public static Singletion getInstance() {
		//���� heap������ ��ü�� ������ ��ü ����
		if(singletion==null) {
			singletion=new Singletion();
		}
		
		//singletion��ü�� �ּҰ� ����
		return singletion;
	}
	

}
