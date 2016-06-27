package com.freeway.bill.webservices.inters;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.freeway.bill.webservices.beans.Messages;

@WebService
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public interface IHelloWorldWebService {

	@WebMethod(operationName = "sayHello")
	@RequestWrapper(targetNamespace = "http://www.freeway.com/types", className = "java.util.List")
	@ResponseWrapper(targetNamespace = "http://www.freeway.com/types", className = "java.lang.String")
	@WebResult(targetNamespace = "http://www.freeway.com/types", name = "sayHello")
	public String sayHello(
	        @WebParam(targetNamespace = "http://www.freeway.com/types", name = "Messages", mode = Mode.IN) Messages msgs);
}
