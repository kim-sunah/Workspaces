package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SELECTLIST {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="kh";
		String password="kh";
		
		Connection con= DriverManager.getConnection(url, user, password);
		
		Statement stmt=con.createStatement();
		String sql="SELECT DEPTNO, DNAME, LOC "
				+ " FROM DEPT"
				+ " ORDER BY DEPTNO DESC";
		
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.printf("%4d %10s %10s \n",
					rs.getInt(1),rs.getString(2),rs.getString(3));
		}
		rs.close();
		stmt.close();
		con.close();
		
		
	}
		
}
