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
		System.out.println("��ȣ �Է�");
		int mno=sc.nextInt();
		System.out.println("�̸� �Է�");
		String mname=sc.next();
		System.out.println("�����Է�");
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
				System.out.println("�Է¼���");
			}else {
				System.out.println("�Է� ����");
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
