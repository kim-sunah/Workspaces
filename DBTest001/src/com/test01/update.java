package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class update {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="kh";
		String password="kh";
		
		Connection con=DriverManager.getConnection(url, user, password);
		
		Statement stmt=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("nickname���� : ");
		String dname=sc.next();
		System.out.println("������ deptno : ");
		int deptno=sc.nextInt();
		String sql=" UPDATE DEPT "
				+ " SET DNAME= '"+dname+"'"
				+" WHERE DEPTNO="+deptno;
		
		int res=stmt.executeUpdate(sql);
		if(res>0) {
			System.out.println("��������");
		}else {
			System.out.println("��������");
		}
		
		stmt.close();
		con.close();
		
	}
}
