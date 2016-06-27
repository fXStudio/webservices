package com.freeway.bill.webservices.models;

import javax.persistence.Table;
import javax.xml.bind.annotation.XmlType;

/**
 * 费率
 * 
 * @author Ajaxfan
 */
@Table(name = "kw_payrate")
@XmlType(name="payrate")
public class Payrate {
	private String instation;
	private String outstation;
	private String cartype;
	private String payrate;
	private Double rate;

	public synchronized String getInstation() {
		return instation;
	}

	public synchronized void setInstation(String instation) {
		this.instation = instation;
	}

	public synchronized String getOutstation() {
		return outstation;
	}

	public synchronized void setOutstation(String outstation) {
		this.outstation = outstation;
	}

	public synchronized String getCartype() {
		return cartype;
	}

	public synchronized void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public synchronized String getPayrate() {
		return payrate;
	}

	public synchronized void setPayrate(String payrate) {
		this.payrate = payrate;
	}

	public synchronized Double getRate() {
		return rate;
	}

	public synchronized void setRate(Double rate) {
		this.rate = rate;
	}
}
