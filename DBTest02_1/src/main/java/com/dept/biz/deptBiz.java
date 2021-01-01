package com.dept.biz;

import java.util.List;

import com.dept.dao.deptDao;
import com.dept.dto.deptDto;

public class deptBiz {
	
	private deptDao dao=new deptDao();
	
	public List<deptDto>selectList(){
		return dao.selectList();
	}
	public deptDto selectOne(int Deptno) {
		return dao.selectOne(Deptno);
	}
	public int insert(deptDto dto) {
		dto.setDname(dto.getDname().toUpperCase());
		return dao.insert(dto);
	}
	public int update(deptDto dto) {
		dto.setDname(dto.getDname().toUpperCase());
		return dao.update(dto);
	}
	public int delete(int deptno) {
		return dao.delete(deptno);
	}

}
