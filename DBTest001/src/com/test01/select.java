package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class select {
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="kh";
		String password="kh";
		
		Connection con=DriverManager.getConnection(url, user, password);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("부서번호 입력");
		int deptno=sc.nextInt();
		
		Statement stmt=con.createStatement();
		String sql="SELECT DEPTNO, DNAME, LOC "
				+ " FROM DEPT "
				+ " WHERE DEPTNO= "+deptno;
		
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.printf("%2d %12s %10s \n",
					rs.getInt(1),rs.getString(2),rs.getString(3));
		}
		rs.close();
		stmt.close();
		con.close();
		
	}

}
