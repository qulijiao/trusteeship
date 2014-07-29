package com.action.trusteeship;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Action  ; 
import com.bean.trusteeship.RosterBean;
import com.dao.TeacherDao;
import com.dao.trsteeship.RosterManagerDao;

public class RosterManagerUpdateSave {
 private int studentId ;
 private RosterBean  rb ;
 
 
 public int getStudentid() {
	return studentId;
}

public void setStudentid(int studentId) {
	this.studentId = studentId;
}

public RosterBean getRb() {
	System.err.println("get rb RosterManagerUpdateSave");
	return rb;
}

public void setRb(RosterBean rb) {
	System.err.println("RosterManagerUpdateSave setRb =========================");
	this.rb = rb;
}

	//处理用户请求的execute方法
	public String execute() throws Exception {
		//解决乱码，用于页面输出
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		System.err.println("RosterManagerUpdateSave execute ");
//		rb=new RosterManagerDao().GetBean(studentId); 
		//跳转
		out.print("<script language='javascript'>alert('修改成功！');window.location='RosterManager.action';</script>");
		out.flush();out.close();
		return null; 
	}
	
	//判断是否空值
	private boolean isInvalid(String value) {
		return (value == null || value.length() == 0);
	}
	
}
