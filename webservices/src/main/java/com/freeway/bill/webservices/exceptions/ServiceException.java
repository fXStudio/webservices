package com.freeway.bill.webservices.exceptions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.ws.WebFault;

@WebFault(name = "ServiceException")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceException extends RuntimeException {
	String exceptionMesssage;
}
