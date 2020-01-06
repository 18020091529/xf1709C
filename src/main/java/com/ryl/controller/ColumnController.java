package com.ryl.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ryl.bean.Columnn;
import com.ryl.service.ColumnService;

import net.sf.jsqlparser.schema.Column;

@Controller
public class ColumnController {
	
	@Resource
	private ColumnService service;
	
	@RequestMapping("/list.do")
	public String getlist(Model model,Columnn column,@RequestParam(defaultValue="1")int pageNum){
		PageHelper.startPage(pageNum,5);
		List list = service.getlist(column);
		PageInfo plist = new PageInfo<>(list);
		model.addAttribute("list",list);
		model.addAttribute("plist",plist);
		return "list";
		
	}
	

}
