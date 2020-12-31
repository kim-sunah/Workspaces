package com.member.controller;

import java.util.List;
import java.util.Scanner;

import com.member.biz.memberBiz;
import com.member.dto.MemberDto;

public class MemberController {
	
	private static Scanner sc=new Scanner(System.in);
	
	public static int getMenu() {
		StringBuffer sb=new StringBuffer();
		
		sb.append("*************\n")
		.append("1.selectlist\n")
		.append("2.selectOne\n")
		.append("3.insert\n")
		.append("4.update\n")
		.append("5.delete\n")
		.append("6.end\n")
		.append("***********\n");
		System.out.println(sb);
		System.out.println("input select : ");
		int select=sc.nextInt();
		return select;
	}

	public static void main(String[] args) {
		int select =0;
		memberBiz biz=new memberBiz();
		
		while(select !=6 ) {
			select=getMenu();
			
			switch(select) {
			case 1:
				System.out.println("----------selectlist-------");
				List<MemberDto>list=biz.selectList();

				for(MemberDto dto:list) {
					System.out.println(dto);
				}
				break;
			case 2:
				System.out.println("-------selectOne----------");
				
				System.out.println("����� ��ȣ : ");
				int selectDeptno=sc.nextInt();
				MemberDto selectDto=biz.selectOne(selectDeptno);
				
				System.out.println(selectDto);
				break;
			case 3:
				System.out.println("---------insert---------");
				
				System.out.println("�߰��� ��ȣ : ");
				int inputDeptno=sc.nextInt();
				System.out.println("�̸� : ");
				String inputDname=sc.next();
				System.out.println("���� : ");
				String inputLoc=sc.next();
				
				MemberDto inputDto=new MemberDto(inputDeptno,inputDname, inputLoc);
				
				int res=biz.insert(inputDto);
				if(res>0) {
					System.out.println("�Է¼���");
				}else {
					System.out.println("�Է½���");
				}
				break;
			case 4:
				System.out.println("-------update-------");
				
				System.out.println("������ ��ȣ:");
				int updateDeptno=sc.nextInt();
				System.out.println("�̸� : ");
				String updateDname=sc.next();
				System.out.println("���� : ");
				String updateLoc=sc.next();
				
				MemberDto updateDto=new MemberDto(
						updateDeptno,
						updateDname,
						updateLoc);
				int updateRes=biz.update(updateDto);
				if(updateRes>0) {
					System.out.println("��������");
				}else {
					System.out.println("��������");
				}
				break;
			case 5:
				System.out.println("--------delete------");
				System.out.println("������ ��ȣ");
				int deleteDeptno=sc.nextInt();
				int deleteRes=biz.delete(deleteDeptno);
				if(deleteRes>0) {
					System.out.println("��������");
				}else {
					System.out.println("���� ����");
				}
				break;
			case 6:
				System.out.println("----����----");
				System.out.println("���α׷��� �����մϴ�....");
				System.exit(0);
			}
		}
	}
}
