package com.member.biz;

import java.util.List;

import com.member.dao.MemberDao;
import com.member.dto.MemberDto;

public class memberBiz {

	private MemberDao dao=new MemberDao();
	
	public List<MemberDto>selectList(){
		return dao.selectList();
	}

	public MemberDto selectOne(int Deptno) {
		return dao.selectOne(Deptno);
	}
	
	public int insert(MemberDto dto) {
		dto.setDname(dto.getDname().toUpperCase());
		return dao.insert(dto);
	}
	
	public int update(MemberDto dto) {
		dto.setDname(dto.getDname().toUpperCase());
		return dao.update(dto);
	}
	
	public int delete(int deptno) {
		return dao.delete(deptno);
	}
}
