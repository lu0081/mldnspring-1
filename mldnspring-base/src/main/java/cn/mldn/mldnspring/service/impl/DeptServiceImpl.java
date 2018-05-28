package cn.mldn.mldnspring.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.mldnspring.dao.IDeptDAO;
import cn.mldn.mldnspring.service.IDeptService;
import cn.mldn.mldnspring.vo.Dept;
@Service
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDAO deptDAO ;	// 自动根据类型注入
	
	@Override
	public boolean add(Dept vo) {
		return this.deptDAO.doCreate(vo); 
	}

}
