package com.freeway.bill.webservices.services.impl;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.freeway.bill.webservices.beans.Insertliterary;
import com.freeway.bill.webservices.dao.IOTimeDao;
import com.freeway.bill.webservices.services.IDataUploadService;

/**
 * 数据导出服务
 * 
 * @author Ajaxfan
 */
@Component("DataUploadService")
@WebService(endpointInterface = "com.freeway.bill.webservices.services.IDataUploadService")
final class DataUploadService implements IDataUploadService {
	private @Autowired IOTimeDao otimeDao;

	@Override
	public String uploadLaneOut(Insertliterary literaries) {
		return null;
	}

	@Override
	public String uploadOTimeNew(Insertliterary literaries) {
		return otimeDao.insertOTimeRecords(literaries);
	}
}
