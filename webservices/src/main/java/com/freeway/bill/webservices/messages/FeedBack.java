package com.freeway.bill.webservices.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "feedback")
@XmlAccessorType(XmlAccessType.FIELD)
public class FeedBack {
	private int code;
	private String content;

	public FeedBack() {
		super();
	}

	public FeedBack(int code, String content) {
		this.code = code;
		this.content = content;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
