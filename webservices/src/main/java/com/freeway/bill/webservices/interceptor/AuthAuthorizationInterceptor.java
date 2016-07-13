package com.freeway.bill.webservices.interceptor;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * WebService访问权限认证
 * 
 * @author Ajaxfan
 */
public class AuthAuthorizationInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
	/** 秘钥的名称 */
	private String security_key;
	/** 秘钥的内容 */
	private String security_value;

	/**
	 * @param security_key
	 * @param security_value
	 */
	public AuthAuthorizationInterceptor(String security_key, String security_value) {
		super(Phase.USER_LOGICAL);
		this.security_key = security_key;
		this.security_value = security_value;
	}

	/**
	 * 对头信息进行分析
	 */
	public void handleMessage(SoapMessage message) throws Fault {
		// 获得SOAP头内容
		for (Header header : message.getHeaders()) {
			// 读取加密头信息
			if ("authheader".equalsIgnoreCase(header.getName().getLocalPart())) {
				// 判断客户端请求是否已被授权，如果未被授权则需要授权后才能访问应用
				if (isValidAccess(((Element) header.getObject()).getChildNodes())) {
					return;
				}
			}
		}
		throw new Fault(new Exception("No Right To Access Method"));
	}

	/**
	 * 判断访问是否有效
	 * 
	 * @param nodes
	 * @return
	 */
	private boolean isValidAccess(NodeList nodes) {
		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);
			// 检查秘钥的内容是否符合系统要求
			if (security_key.equalsIgnoreCase(node.getNodeName())) {
				if (security_value.equals(node.getTextContent())) {
					return true;
				}
			}
		}
		return false;
	}
}
