package com.freeway.bill.webservices.services;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.freeway.bill.webservices.beans.Insertliterary;
import com.freeway.bill.webservices.beans.WSResult;

@SOAPBinding(style = Style.DOCUMENT)
@WebService
public interface IDataUploadService {
    /**
     * @return 车流量信息
     */
    public @WebResult(name = "result", partName = "result") WSResult uploadLaneOut(@WebParam(
            name = "sqls",
            partName = "sqls",
            targetNamespace = "http://webservices.bill.freeway.com/types") Insertliterary literaries);

    /**
     * @return 人员交接班信息
     */
    public @WebResult(name = "result", partName = "result") WSResult uploadOTimeNew(@WebParam(
            name = "sqls",
            partName = "sqls",
            targetNamespace = "http://webservices.bill.freeway.com/types") Insertliterary literaries);
}
