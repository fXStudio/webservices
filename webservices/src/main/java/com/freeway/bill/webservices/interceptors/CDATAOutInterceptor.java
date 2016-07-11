package com.freeway.bill.webservices.interceptors;

import java.io.OutputStream;

import javax.xml.stream.XMLStreamWriter;

import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.staxutils.StaxUtils;

import com.freeway.bill.webservices.cdata.CDATAXMLStreamWriter;

public class CDATAOutInterceptor extends AbstractPhaseInterceptor<Message> {
	public CDATAOutInterceptor() {
		super(Phase.WRITE);
	}

	@Override
	public void handleMessage(Message message) {
		message.put("disable.outputstream.optimization", Boolean.TRUE);
		XMLStreamWriter writer = StaxUtils.createXMLStreamWriter(message.getContent(OutputStream.class));
		message.setContent(XMLStreamWriter.class, new CDATAXMLStreamWriter(writer));
	}

}
