package com.test06;

public class Profile {
	
	private String name;
	private String phone;
	
	public Profile(String name, String phone) {
		this.name=name;
		this.phone=phone;
	}
	
	public void printProfile() {
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ��ȣ : "+phone);
	}

}