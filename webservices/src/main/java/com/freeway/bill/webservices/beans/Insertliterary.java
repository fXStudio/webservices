package com.freeway.bill.webservices.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Insertliterary {
	@XmlElement(name = "sql")
	public List<String> objs = new ArrayList<String>();

	public void addLiterary(String msg) {
		objs.add(msg);
	}

	public List<String> getLiteraris() {
		return this.objs;
	}
}
