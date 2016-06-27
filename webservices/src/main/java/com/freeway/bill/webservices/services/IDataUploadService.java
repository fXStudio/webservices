package com.freeway.bill.webservices.services;

import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.freeway.bill.webservices.beans.Insertliterary;

@SOAPBinding(style = Style.RPC, use = Use.LITERAL, parameterStyle = ParameterStyle.BARE)
@WebService
public interface IDataUploadService {
	/**
	 * @return 车流量信息
	 */
	public String uploadLaneOut(@WebParam(
	        targetNamespace = "http://www.freeway.com/types",
	        name = "laneoutInserts",
	        mode = Mode.IN) Insertliterary literaries);

	/**
	 * @return 人员交接班信息
	 */
	public String uploadOTimeNew(@WebParam(
	        targetNamespace = "http://www.freeway.com/types",
	        name = "otimeInserts",
	        mode = Mode.IN) Insertliterary literaries);
}
