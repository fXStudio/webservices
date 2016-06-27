package com.freeway.bill.webservices.models;

import javax.persistence.Table;
import javax.xml.bind.annotation.XmlType;

/**
 * 人员信息
 * 
 * @author Ajaxfan
 */
@Table(name = "fs_org_person")
@XmlType
public class Person {
	private String account;
	private String name;
	private String sex;
	private String department;
	private String parent;
	private String role;
	private String levelname;
	private String secretlevel;
	private String idcard;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLevelname() {
		return levelname;
	}

	public void setLevelname(String levelname) {
		this.levelname = levelname;
	}

	public String getSecretlevel() {
		return secretlevel;
	}

	public void setSecretlevel(String secretlevel) {
		this.secretlevel = secretlevel;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
}
