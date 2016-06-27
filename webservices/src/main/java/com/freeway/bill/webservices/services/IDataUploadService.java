package com.freeway.bill.webservices.services;

import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.freeway.bill.webservices.beans.Insertliterary;
import com.freeway.bill.webservices.beans.WSResult;

@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
@WebService
public interface IDataUploadService {
	/**
	 * @return 车流量信息
	 */
	public @WebResult(name = "result") WSResult uploadLaneOut(@WebParam(
			targetNamespace = "http://www.freeway.com/types", name = "laneoutsqls",
			mode = Mode.IN) Insertliterary literaries);

	/**
	 * @return 人员交接班信息
	 */
	public @WebResult(name = "result") WSResult uploadOTimeNew(@WebParam(
			targetNamespace = "http://www.freeway.com/types", name = "otimesqls",
			mode = Mode.IN) Insertliterary literaries);
}
