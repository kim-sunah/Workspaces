package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insert {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="kh";
		String password="kh";
		
		Connection con=DriverManager.getConnection(url, user, password);
		
		Statement stmt= con.createStatement();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("mno�Է�");
		int deptno=sc.nextInt();
		System.out.println("mname�Է�");
		String dname=sc.next();
		System.out.println("nickname�Է�");
		String loc=sc.next();
		
		String sql="INSERT INTO DEPT "
				+ "VALUES("+ deptno+",'"+dname+"','"+loc+"')";
		
		int res=stmt.executeUpdate(sql);
		if(res>0) {
			System.out.println("�Է¼���");
		}else {
			System.out.println("�Է½���");
		}
		stmt.close();
		con.close();
	}
}
