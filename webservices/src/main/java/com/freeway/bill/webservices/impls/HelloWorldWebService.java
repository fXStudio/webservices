package com.freeway.bill.webservices.impls;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import org.springframework.stereotype.Component;

import com.freeway.bill.webservices.beans.Messages;
import com.freeway.bill.webservices.inters.IHelloWorldWebService;

@Component(value = "HelloWorldWebService")
@WebService(endpointInterface = "com.freeway.bill.webservices.inters.IHelloWorldWebService")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)

// wsdlLocation = "/WEB-INF/wsdl/HelloWorldWebService.wsdl",
// name = "HelloWorldWebService",
// serviceName = "HelloWorldWebService",
// portName = "HelloWorldWebService",
// targetNamespace = "http://inters.webservices.bill.freeway.com/"
public class HelloWorldWebService implements IHelloWorldWebService {

	@Override
	public String sayHello(Messages msgs) {
		for (String msg : msgs.getMsgs()) {
			System.out.println(msg);
		}
		return "success";
	}
}
