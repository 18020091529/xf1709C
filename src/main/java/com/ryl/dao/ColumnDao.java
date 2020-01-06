package com.ryl.dao;

import java.util.List;

import com.ryl.bean.Columnn;

public interface ColumnDao {
	
	List getlist(Columnn column);
	
	
	int add(Columnn column);
}
