package com.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.member.dto.MemberDto;

import static com.member.db.Template.*;

public class MemberDao {

	public List<MemberDto>selectList(){
	
		Connection con=getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		List<MemberDto>list=new ArrayList<MemberDto>();
		
		String sql=" SELECT DEPTNO, DNAME, LOC "
				+ " FROM DEPT "
				+ " ORDER BY DEPTNO DESC ";
		try {
			stmt=con.createStatement();
			
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				MemberDto dto=new MemberDto();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
			close(con);
		}
		return list;
	}
	
	public MemberDto selectOne(int mno) {

		Connection con=getConnection();
		PreparedStatement pstm=null;
		ResultSet rs=null;
		MemberDto dto=null;
		String sql="SELECT DEPTNO, DNAME, LOC "
				+ " FROM DEPT "
				+ " WHERE DEPTNO=? ";
		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, mno);
			
			rs=pstm.executeQuery();
			while(rs.next()) {
				dto=new MemberDto();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
			}
		}catch (SQLException e) {
			close(rs);
			close(pstm);
			close(con);
		}
		return dto;
	}

	public int insert(MemberDto dto) {
		
		Connection con=getConnection();
		PreparedStatement pstm=null;
		int res=0;
		String sql=" INSERT INTO DEPT "
				+ " VALUES(?,?,?) ";
		
		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, dto.getDeptno());
			pstm.setString(2, dto.getDname());
			pstm.setString(3, dto.getLoc());
			
			res=pstm.executeUpdate();
			if(res>0) {
				commit(con);
			}
		} catch (SQLException e) {
			System.out.println("[error]3.4.");
			e.printStackTrace();
		}finally {
			close(pstm);
			close(con);
		}
		return res;
	}
	
	public int update(MemberDto dto) {
		Connection con=getConnection();
		PreparedStatement pstm=null;
		int result=0;
		String sql="UPDATE DEPT "
				+ " SET DNAME=?, LOC=? "
				+ " WHERE DEPTNO=? ";
		try {
			pstm=con.prepareStatement(sql);
		
			pstm.setString(1, dto.getDname());
			pstm.setString(2, dto.getLoc());
			pstm.setInt(3, dto.getDeptno());
			
			result=pstm.executeUpdate();
			if(result>0) {
				commit(con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
			close(con);
		}
		return result;
	}
	
	public int delete(int mno) {
		Connection con=getConnection();
		PreparedStatement pstm=null;
		int res=0;
		String sql=" DELETE FROM DEPT WHERE DEPTNO=? ";
		
		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, mno);
			res=pstm.executeUpdate();
			if(res>0) {
				commit(con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
			close(con);
		}
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
