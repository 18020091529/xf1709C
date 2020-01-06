package com.ryl.service;

import java.util.List;

import com.ryl.bean.Columnn;

public interface ColumnService {
	
	List getlist(Columnn column);
	
	
	int add(Columnn column);

}
