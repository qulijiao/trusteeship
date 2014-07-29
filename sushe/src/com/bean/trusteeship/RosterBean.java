package com.bean.trusteeship;

import java.util.ArrayList;
import java.util.List;

import com.action.trusteeship.RosterManager;

public class RosterBean {
	private int studentId;
	private int trusteeshipid;
	private String studentname;
	private int years;
	private String guardianname1;
	private String guardianPhone1;
	private String relationship1;
	private String guardianname2;
	private String guardianPhone2;
	private String relationship2;
	private String desctribtion;
	private String sex;
	private String address;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRelationship1() {
		return relationship1;
	}

	public void setRelationship1(String relationship1) {
		this.relationship1 = relationship1;
	}

	public String getRelationship2() {
		return relationship2;
	}

	public void setRelationship2(String relationship2) {
		this.relationship2 = relationship2;
	}



	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getStudentId() {
		System.err.println("getStudentId"+studentId);
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.err.println("setStudentId"+studentId );
		this.studentId = studentId;
	}

	public int getTrusteeshipid() {
		System.err.println("getTrusteeshipid"+trusteeshipid);
		return trusteeshipid;
	}

	public void setTrusteeshipid(int trusteeshipid) {
		this.trusteeshipid = trusteeshipid;
	}

	public String getStudentname() {
		System.err.println("getStudentname:"+ studentname);
		return studentname;
	}

	public void setStudentname(String studentname) {
		System.err.println("setStudentname"+ studentname);
		this.studentname = studentname;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public String getGuardianname1() {
		return guardianname1;
	}

	public void setGuardianname1(String guardianname1) {
		this.guardianname1 = guardianname1;
	}

	public String getGuardianPhone1() {
		return guardianPhone1;
	}

	public void setGuardianPhone1(String guardianPhone1) {
		this.guardianPhone1 = guardianPhone1;
	}

	public String getGuardianname2() {
		return guardianname2;
	}

	public void setGuardianname2(String guardianname2) {
		System.err.println("updatesave setGuardianname2 "+guardianname2);
		this.guardianname2 = guardianname2;
	}

	public String getGuardianPhone2() {
		return guardianPhone2;
	}

	public void setGuardianPhone2(String guardianPhone2) {
		this.guardianPhone2 = guardianPhone2;
	}

	public String getDesctribtion() {
		System.err.println("desctribtion="+desctribtion);
		return desctribtion;
	}

	public void setDesctribtion(String desc) {
		System.err.println("RosterBean setDesctribtion  :"+desc);
		this.desctribtion = desc;
	}

//	public List<RosterBean> getList() {
//		List<RosterBean> list=  new ArrayList<RosterBean>();
//		RosterBean rb1 = new RosterBean();
//		rb1.setStudentId(1);
//		rb1.setTrusteeshipid(1);
//		rb1.setStudentname("ด๓นท");
//		list.add(rb1);
//		return list;
//	}



}
