package com.freeway.bill.webservices.models;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlType;

/**
 * 部门
 * 
 * @author Ajaxfan
 */
@Table(name = "fs_org_dept")
@XmlType
public class Dept {
	@Id
	private String rowid;
	private String deptname;
	private String homestation;
	private String bmjc;

	public String getRowid() {
		return rowid;
	}

	public void setRowid(String rowid) {
		this.rowid = rowid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getHomestation() {
		return homestation;
	}

	public void setHomestation(String homestation) {
		this.homestation = homestation;
	}

	public String getBmjc() {
		return bmjc;
	}

	public void setBmjc(String bmjc) {
		this.bmjc = bmjc;
	}
}
