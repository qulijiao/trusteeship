package com.action.trusteeship;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Action;
import com.bean.trusteeship.RosterBean;
import com.dao.TeacherDao;
import com.dao.trsteeship.RosterManagerDao;

public class RosterManagerUpdateSave {
	private int studentId;
//	private RosterBean rb;
	private int trusteeshipid;
	private String studentname;
	private int years;
	private String guardianname1;
	private String guardianPhone1;
	private String relationship1;
	private String guardianname2;
	private String guardianPhone2;
	private String relationship2;
	private String description;
	private String sex;
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		System.err.println("RosterManagerUpdateSave-setAddress:"+address);
		this.address = address;
	}

	public String getRelationship1() {
		return relationship1;
	}

	public void setRelationship1(String relationship1) {
		System.err.println("RosterManagerUpdateSave-setrelationship1:"+relationship1);
		this.relationship1 = relationship1;
	}

	public String getRelationship2() {
		return relationship2;
	}

	public void setRelationship2(String relationship2) {
		System.err.println("RosterManagerUpdateSave-setrelationship2:"+relationship2);
		this.relationship2 = relationship2;
	}

	public String getSex() {
		
		return sex;
	}

	public void setSex(String sex) {
		System.err.println("RosterManagerUpdateSave-setSex:"+sex);
		this.sex = sex;
	}

	public int getStudentId() {
		System.err.println("getStudentId-updatesave:" + studentId);
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.err.println("RosterManagerUpdateSave-studentId:" + studentId);
		this.studentId = studentId;
	}

	public int getTrusteeshipid() {
		return trusteeshipid;
	}

	public void setTrusteeshipid(int trusteeshipid) {
		System.err.println("RosterManagerUpdateSave-setTrusteeshipid:"+trusteeshipid);
		this.trusteeshipid = trusteeshipid;
	}

	public String getStudentname() {
		System.err.println("getStudentname" + studentname);
		return studentname;
	}

	public void setStudentname(String studentname) {
		System.err.println("RosterManagerUpdateSave setStudentname:" + studentname);
		this.studentname = studentname;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		System.err.println("RosterManagerUpdateSave setYears:" + years);
		this.years = years;
	}

	public String getGuardianname1() {
		return guardianname1;
	}

	public void setGuardianname1(String guardianname1) {
		System.err.println("RosterManagerUpdateSave setGuardianname1:" + guardianname1);		
		this.guardianname1 = guardianname1;
	}

	public String getGuardianPhone1() {
		return guardianPhone1;
	}

	public void setGuardianPhone1(String guardianPhone1) {
		System.err.println("RosterManagerUpdateSave setGuardianPhone1:" + guardianPhone1);	
		this.guardianPhone1 = guardianPhone1;
	}

	public String getGuardianname2() {
		return guardianname2;
	}

	public void setGuardianname2(String guardianname2) {
		System.err.println("RosterManagerUpdateSave setGuardianname2:" + guardianname2);			
		this.guardianname2 = guardianname2;
	}

	public String getGuardianPhone2() {
		return guardianPhone2;
	}

	public void setGuardianPhone2(String guardianPhone2) {
		System.err.println("RosterManagerUpdateSave setGuardianPhone2:" + guardianPhone2);			
		this.guardianPhone2 = guardianPhone2;
	}

	public String getDescription() {
		System.err.println("RosterManagerUpdateSave getdescribtion:"+ description);
		return description;
	}

	public void setDescription(String description) {		
		System.err.println("RosterManagerUpdateSave setdescribtion:"+ description);
		this.description = description;
	}

	public int getStudentid() {
		return studentId;
	}

	public void setStudentid(int studentId) {
		System.err.println("RosterManagerUpdateSave setStudentid" + studentId);					
		this.studentId = studentId;
	}

 

	// 处理用户请求的execute方法
	public String execute() throws Exception {
		// 解决乱码，用于页面输出
		HttpServletResponse response = null;
		response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=GBK");
		response.setCharacterEncoding("GBK");
		PrintWriter out = response.getWriter();
		System.err.println("RosterManagerUpdateSave execute ");
		RosterBean rb = new RosterBean();
		rb.setStudentId(studentId);
		rb.setTrusteeshipid(trusteeshipid);
		rb.setStudentname(studentname);
		rb.setYears(years);
		rb.setGuardianname1(guardianname1);
		rb.setGuardianPhone1(guardianPhone1);
		rb.setGuardianname2(guardianname2);
		rb.setGuardianPhone2(guardianPhone2);
		rb.setRelationship1(relationship1);
		rb.setRelationship2(relationship2);		
		rb.setDescription(description);
		rb.setSex(sex);
		rb.setAddress(address);
		
		
		new RosterManagerDao().Update(rb);
		// rb=new RosterManagerDao().GetBean(studentId);
		// 跳转
		out.print("<script language='javascript'>alert('修改成功！');window.location='RosterManager.action';</script>");
		out.flush();
		out.close();
		return null;
	}

	// 判断是否空值
	private boolean isInvalid(String value) {
		return (value == null || value.length() == 0);
	}

}
