package com.detp.controller;

import java.util.List;
import java.util.Scanner;

import com.dept.biz.deptBiz;
import com.dept.dto.deptDto;

public class deptController {
	
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
		int select=0;
		deptBiz biz=new deptBiz();
		
		while(select !=6 ) {
			select=getMenu();
			
			switch(select) {
			case 1:
				System.out.println("----------selectlist-------");
				List<deptDto>list=biz.selectList();

				for(deptDto dto:list) {
					System.out.println(dto);
				}
				break;
			case 2:
				System.out.println("-------selectOne----------");
				
				System.out.println("출력할 번호 : ");
				int selectDeptno=sc.nextInt();
				deptDto selectDto=biz.selectOne(selectDeptno);
				
				System.out.println(selectDto);
				break;
			case 3:
				System.out.println("---------insert---------");
				
				System.out.println("추가할 번호 : ");
				int inputDeptno=sc.nextInt();
				System.out.println("이름 : ");
				String inputDname=sc.next();
				System.out.println("별명 : ");
				String inputLoc=sc.next();
				
				deptDto inputDto=new deptDto(inputDeptno,inputDname, inputLoc);
				
				int res=biz.insert(inputDto);
				if(res>0) {
					System.out.println("입력성공");
				}else {
					System.out.println("입력실패");
				}
				break;
			case 4:
				System.out.println("-------update-------");
				
				System.out.println("수정할 번호:");
				int updateDeptno=sc.nextInt();
				System.out.println("이름 : ");
				String updateDname=sc.next();
				System.out.println("별명 : ");
				String updateLoc=sc.next();
				
				deptDto updateDto=new deptDto(
						updateDeptno,
						updateDname,
						updateLoc);
				int updateRes=biz.update(updateDto);
				if(updateRes>0) {
					System.out.println("수정성공");
				}else {
					System.out.println("수정실패");
				}
				break;
			case 5:
				System.out.println("--------delete------");
				System.out.println("삭제할 번호");
				int deleteDeptno=sc.nextInt();
				int deleteRes=biz.delete(deleteDeptno);
				if(deleteRes>0) {
					System.out.println("삭제성공");
				}else {
					System.out.println("삭제 실패");
				}
				break;
			case 6:
				System.out.println("----종료----");
				System.out.println("프로그램을 종료합니다....");
				System.exit(0);
			}
		}
		
	}
}
