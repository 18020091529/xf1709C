package com.ryl.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ryl.bean.Columnn;
import com.ryl.dao.ColumnDao;

@Service
@Transactional
public class ColumnServiceImpl implements ColumnService{
	@Resource
	private ColumnDao dao;

	@Override
	public List getlist(Columnn column) {
		// TODO Auto-generated method stub
		return dao.getlist(column);
	}

	@Override
	public int add(Columnn column) {
		int add = dao.add(column);
		// TODO Auto-generated method stub
		return add;
	}
}
