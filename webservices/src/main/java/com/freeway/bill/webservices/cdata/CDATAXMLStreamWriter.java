package com.freeway.bill.webservices.cdata;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.apache.cxf.staxutils.DelegatingXMLStreamWriter;

public class CDATAXMLStreamWriter extends DelegatingXMLStreamWriter {
	public CDATAXMLStreamWriter(XMLStreamWriter writer) {
		super(writer);
	}

	@Override
	public void writeCharacters(String text) throws XMLStreamException {
		boolean useCharacters = isNeedCData(text);
		if (useCharacters) {
			super.writeCharacters(text);
		} else {
			super.writeCData(text);
		}
	}

	private boolean isNeedCData(String text) {
		return text.matches("[\\d\\w\u4E00-\u9FA5]+");
	}
}