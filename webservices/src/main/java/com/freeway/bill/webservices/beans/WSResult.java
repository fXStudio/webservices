package com.freeway.bill.webservices.beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 运行结果
 * 
 * @author Ajaxfan
 */
@XmlRootElement(name = "result")
public class WSResult {
	private String status = "success";
	private String message;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
