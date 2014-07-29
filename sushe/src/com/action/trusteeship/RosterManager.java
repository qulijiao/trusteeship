package com.action.trusteeship;

import java.util.ArrayList;
import java.util.List;

import com.bean.TeacherBean;
import com.bean.trusteeship.RosterBean;
import com.dao.trsteeship.RosterManagerDao;
import com.opensymphony.xwork2.ActionSupport;

public class RosterManager extends ActionSupport { 
	//下面是Action内用于封装用户请求参数的属性
	private List<RosterBean> list1;
	public List<RosterBean> getList() {
		System.err.println("getlist2--------------");
		return list1;		
	}

	public void setList(List<RosterBean> list) {
		System.err.println("setlist2--------------------");
		this.list1 = list;
	}
 
	// 处理用户请求的execute方法
	public String execute() throws Exception {
		System.err.println("RosterManager-----------------------");
//		list1 = new RosterBean().getList();
		list1 = new RosterManagerDao().getList("","");
		return SUCCESS;
	}
}
