package com.test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.bo.BJg0101;
import com.test.dao.Bjg0101Dao;
import com.test.service.QueryDateService;

@Service("queryDateService") 
public class QueryDateServiceImpl implements QueryDateService{
	@Resource  
	private Bjg0101Dao bjg0101Dao;  
	@Override  
	public BJg0101 findBj0101(String name) {
		// TODO Auto-generated method stub
		return this.bjg0101Dao.findBjByPk(name);
	}
}
