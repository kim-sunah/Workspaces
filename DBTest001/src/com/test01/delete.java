package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class delete {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="kh";
		String password="kh";
		
		Connection con=null;
		
		try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Statement stmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("삭제할 번호 : ");
		int mno=sc.nextInt();
		String sql="DELETE FROM DEPT WHERE DEPTNO = "+mno;
		
		int res=0;
		try {
			stmt=con.createStatement();
			
			res=stmt.executeUpdate(sql);
			if(res>0) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
