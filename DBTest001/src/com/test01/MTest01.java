package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MTest01 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="kh";
		String password="kh";
		Connection con=DriverManager.getConnection(url,user,password);
		
		String sql=" SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO"
				+ " FROM EMP ";
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.printf("%5d %10s %10s %5d %10s %6.1f %6.1f %5d \n",
					rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),
					rs.getDate("hiredate"),rs.getDouble("sal"),rs.getDouble("comm"),rs.getInt("deptno"));
		}
		rs.close();
		stmt.close();
		con.close();
	}

}
