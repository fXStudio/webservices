package com.freeway.bill.webservices.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlType
public class Messages {
	@XmlElement(name="Message")
	public List<String> objs = new ArrayList<String>();

	public void addMessage(String msg) {
		objs.add(msg);
	}

	public List<String> getMsgs() {
		return this.objs;
	}
}
