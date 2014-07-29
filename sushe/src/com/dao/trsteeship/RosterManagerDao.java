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
	//�ж��Ƿ��ֵ
	private boolean isInvalid(String value) {
		return (value == null || value.length() == 0);
	}
	
	public List<RosterBean> getList(String strwhere,String strorder){
		System.err.println("RosterBean-----getList");
		List<RosterBean> list = new ArrayList<RosterBean>();
		String sql="select * from Roster ";		 
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn(); 
		try{
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while(rs.next()){
				RosterBean cnbean=new RosterBean();
				cnbean.setStudentname(rs.getString("studentname"));
				cnbean.setSex(rs.getString("sex")); 
				cnbean.setYears(rs.getInt("years")); 
				cnbean.setGuardianname1(rs.getString("guardianname1")); 
				cnbean.setGuardianPhone1(rs.getString("guardianPhone1")); 
				cnbean.setRelationship1(rs.getString("relationship1")); 
				cnbean.setGuardianname2(rs.getString("guardianname2"));
				cnbean.setGuardianPhone2(rs.getString("guardianPhone2"));
				cnbean.setRelationship2(rs.getString("relationship2"));
				cnbean.setDesc(rs.getString("desc"));
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
	
}
