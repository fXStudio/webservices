package webservices;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;

import com.freeway.bill.webservices.inters.IHelloWorldWebService;

public class WSDemo {
	@Test
	public void wstest() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		factory.setServiceClass(IHelloWorldWebService.class);
		factory.setAddress("http://localhost:8080/webservices/services/hello_world");
		IHelloWorldWebService client = (IHelloWorldWebService) factory.create();

		// String msg = client.sayHello(
		// Arrays.asList(new SupplyMessage[] { new SupplyMessage("ajaxfan"), new
		// SupplyMessage("roma") }));
		// System.out.println(msg);
		System.exit(0);
	}
}
