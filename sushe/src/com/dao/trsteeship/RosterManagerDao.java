package com.dao.trsteeship;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.TeacherBean;
import com.bean.trusteeship.RosterBean;
import com.db.DBHelper;

public class RosterManagerDao {
	// �ж��Ƿ��ֵ
	private boolean isInvalid(String value) {
		return (value == null || value.length() == 0);
	}

	public List<RosterBean> getList(String strwhere, String strorder) {
		System.err.println("RosterBean-----getList");
		List<RosterBean> list = new ArrayList<RosterBean>();
		String sql = "select * from Roster ";
		if (!isInvalid(strwhere)) {
			sql = sql + " where " + strwhere;
		}
		if (!(isInvalid(strorder))) {
			sql += " order by " + strorder;
		}
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while (rs.next()) {
				RosterBean cnbean = new RosterBean();
				// System.err.println("rs.getString(studentId)="
				// +rs.getString("studentId"));
				cnbean.setStudentId(rs.getInt("studentId"));
				cnbean.setTrusteeshipid(rs.getInt("trusteeshipid"));
				cnbean.setStudentname(rs.getString("studentname"));
				cnbean.setSex(rs.getString("sex"));
				cnbean.setYears(rs.getInt("years"));
				cnbean.setGuardianname1(rs.getString("guardianname1"));
				cnbean.setGuardianPhone1(rs.getString("guardianPhone1"));
				cnbean.setRelationship1(rs.getString("relationship1"));
				cnbean.setGuardianname2(rs.getString("guardianname2"));
				cnbean.setGuardianPhone2(rs.getString("guardianPhone2"));
				cnbean.setRelationship2(rs.getString("relationship2"));
				cnbean.setDescription(rs.getString("description"));
				cnbean.setAddress(rs.getString("address"));
				list.add(cnbean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (stat != null)
					stat.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public RosterBean GetBean(int studentid2) {
		System.err.println("RosterBean-----GetBean");
		List<RosterBean> list = new ArrayList<RosterBean>();
		System.err.println("studentid2=" + studentid2);
		String sql = "select * from Roster where studentid = "
				+ String.valueOf(studentid2) + "";  
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		RosterBean cnbean = null;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while (rs.next()) {
				cnbean = new RosterBean();
				cnbean.setStudentId(rs.getInt("studentId"));
				cnbean.setTrusteeshipid(rs.getInt("trusteeshipid"));
				cnbean.setStudentname(rs.getString("studentname"));
				cnbean.setSex(rs.getString("sex"));
				cnbean.setYears(rs.getInt("years"));
				cnbean.setGuardianname1(rs.getString("guardianname1"));
				cnbean.setGuardianPhone1(rs.getString("guardianPhone1"));
				cnbean.setRelationship1(rs.getString("relationship1"));
				cnbean.setGuardianname2(rs.getString("guardianname2"));
				cnbean.setGuardianPhone2(rs.getString("guardianPhone2"));
				cnbean.setRelationship2(rs.getString("relationship2"));
				cnbean.setDescription(rs.getString("description"));
//				cnbean.setDesctribtion(rs.getString("desctribtion"));
				
				cnbean.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (stat != null)
					stat.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnbean;
	}

	// �޸�
	public void Update(RosterBean rb) {
		System.err.println("update RosterBean-------------------------------:");
		String sql = "update Roster set ";
		sql += "studentname='" + rb.getStudentname() + "',";
		sql += "sex='" + rb.getSex() + "',";
		sql += "years='" + rb.getYears() + "',";
		sql += "guardianname1='" + rb.getGuardianname1()   + "',";
		sql += "guardianPhone1='" + rb.getGuardianPhone1() + "',";
		sql += "guardianname2='" + rb.getGuardianname2()   + "',";
		sql += "guardianPhone2='" + rb.getGuardianPhone2() + "',";
		sql += "address='" + rb.getAddress() 			   + "',";
		sql += "description='" + rb.getDescription() 		 			   + "'";
		sql += " where studentId='" + rb.getStudentId()    + "'";
		System.err.println("sql3=" + sql);
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		try {
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (stat != null)
					stat.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
