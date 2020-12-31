package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert_try {

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
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("번호 입력");
		int mno=sc.nextInt();
		System.out.println("이름 입력");
		String mname=sc.next();
		System.out.println("별명입력");
		String nickname=sc.next();
		
		String sql="INSERT INTO DEPT "
				+ " VALUES(?,?,?) ";
		PreparedStatement pstm=null;
		
		int res=0;
		
		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, mno);
			pstm.setString(2, mname);
			pstm.setString(3,nickname);
			
			res=pstm.executeUpdate();
			
			if(res>0) {
				System.out.println("입력성공");
			}else {
				System.out.println("입력 실패");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
