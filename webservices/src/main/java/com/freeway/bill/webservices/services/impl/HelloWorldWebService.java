package com.freeway.bill.webservices.services.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import org.springframework.stereotype.Component;

import com.freeway.bill.webservices.beans.Insertliterary;
import com.freeway.bill.webservices.services.IHelloWorldWebService;

@Component(value = "HelloWorldWebService")
@WebService(endpointInterface = "com.freeway.bill.webservices.services.IHelloWorldWebService")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)

// wsdlLocation = "/WEB-INF/wsdl/HelloWorldWebService.wsdl",
// name = "HelloWorldWebService",
// serviceName = "HelloWorldWebService",
// portName = "HelloWorldWebService",
// targetNamespace = "http://inters.webservices.bill.freeway.com/"
final class HelloWorldWebService implements IHelloWorldWebService {

	@Override
	public String sayHello(Insertliterary msgs) {
		return "success";
	}
}
