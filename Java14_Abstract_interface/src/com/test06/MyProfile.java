package com.test06;

public class MyProfile extends Profile implements Display,Job{

	private String loc;
	
	public MyProfile(String name, String phone) {
		super(name, phone);
	}
	
	//setter
	@Override
	public void jobLoc(String loc) {
		this.loc=loc;
	}
	
	@Override
	public void display() {
		printProfile();
		System.out.println("ȸ�� �ּ� : "+loc);
		System.out.println("ȸ�� ���� : "+JOB_ID);
	}
}
