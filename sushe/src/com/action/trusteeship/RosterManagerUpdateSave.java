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

	//�����û������execute����
	public String execute() throws Exception {
		//������룬����ҳ�����
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		System.err.println("RosterManagerUpdateSave execute ");
//		rb=new RosterManagerDao().GetBean(studentId); 
		//��ת
		out.print("<script language='javascript'>alert('�޸ĳɹ���');window.location='RosterManager.action';</script>");
		out.flush();out.close();
		return null; 
	}
	
	//�ж��Ƿ��ֵ
	private boolean isInvalid(String value) {
		return (value == null || value.length() == 0);
	}
	
}
