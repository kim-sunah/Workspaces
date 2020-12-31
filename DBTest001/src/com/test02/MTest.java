package com.test02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class MTest {

	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		int select=0;
		
		while(select !=6) {
			System.out.println("-----------");
			System.out.println("메뉴선택");
			System.out.println("1.list");
			System.out.println("2.listone");
			System.out.println("3.insert");
			System.out.println("4.update");
			System.out.println("5.delete");
			System.out.println("6.finsh");
			System.out.println("-------------");
			select=sc.nextInt();
			
			switch(select) {
			case 1:
				selectList();
				break;
			case 2:
				selectOne();
				break;
			case 3:
				insert();
				break;
			case 4:
				update();
				break;
			case 5:
				delete();
				break;
			case 6:
				System.exit(0);
			}
		}
	}
	public static void selectList() {
		Connection con= getConnection();
		
		Statement stmt=null;
		ResultSet rs=null;
		String sql=" SELECT DEPTNO, DNAME, LOC "
				+ " FROM DEPT "
				+ " ORDER BY DEPTNO DESC ";
		
		try {
			stmt=con.createStatement();
			
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.printf("%4d %10s %10s \n",
						rs.getInt(1),rs.getString(2),rs.getString(3));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void selectOne() {
		
		Connection con=getConnection();
		
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		System.out.println("번호선택");
		int mno=sc.nextInt();
		
		String sql="SELECT DEPTNO, DNAME, LOC "
				+ " FROM DEPT "
				+ " WHERE DEPTNO =? ";
		
		try {
			pstm =con.prepareStatement(sql);
			pstm.setInt(1, mno);
			
			rs=pstm.executeQuery();
			while(rs.next()) {
				System.out.printf("%4d %10s %10s \n ",
						rs.getInt(1),rs.getString(2),rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void insert() {
		
		Connection con= getConnection();
		
		PreparedStatement pstm=null;
		int res=0;
		System.out.println("입력할 번호 : ");
		int mno=sc.nextInt();
		System.out.println("입력할 이름 : ");
		String mname=sc.next();
		System.out.println("입력할 별명 : ");
		String nickname=sc.next();
		
		String sql=" INSERT INTO DEPT "
				+ " VALUES(?,?,?)";
		
		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, mno);
			pstm.setString(2, mname);
			pstm.setString(3, nickname);
			
			res=pstm.executeUpdate();
			if(res>0) {
				System.out.println("입력성공");
			}else {
				System.out.println("입력실패");
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
	
	public static void update() {
		Connection con=getConnection();
		
		PreparedStatement pstm=null;
		
		int res=0;
		System.out.println("수정할 별명 : ");
		String nickname=sc.next();
		System.out.println("수정할 번호 : ");
		int mno=sc.nextInt();
		
		String sql=" UPDATE DEPT "
				+ "SET DNAME=? "
				+ " WHERE DEPTNO=? ";
		
		try {
			pstm=con.prepareStatement(sql);
			pstm.setString(1, nickname);
			pstm.setInt(2, mno);
			
			res=pstm.executeUpdate();
			if(res>0) {
				System.out.println("수정성공");
			}else {
				System.out.println("수정 실패");
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
	
	public static void delete() {
		
		Connection con=getConnection();
		
		PreparedStatement pstm=null;
		int res=0;
		System.out.println("삭제할 번호 : ");
		int mno=sc.nextInt();
		String sql="DELETE FROM DEPT "
				+ "WHERE DEPTNO=? ";

		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, mno);
			
			res=pstm.executeUpdate();
			if(res>0){
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
		}catch (SQLException e) {
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
	
	
	
	
	private static Connection getConnection() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="kh";
		String password="kh";
		
		Connection con= null;
		
		try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
