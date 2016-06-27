package com.freeway.bill.webservices.services.impl;

import java.sql.SQLException;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.freeway.bill.webservices.beans.Insertliterary;
import com.freeway.bill.webservices.beans.WSResult;
import com.freeway.bill.webservices.dao.ILaneoutDao;
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
	/** 交接班数据接口 */
	private @Autowired IOTimeDao otimeDao;
	/** 车流量数据接口 */
	private @Autowired ILaneoutDao laneoutDao;

	/**
	 * 车流量数据上传
	 */
	@Override
	public WSResult uploadLaneOut(Insertliterary literaries) {
		WSResult result = new WSResult();// 默认为success状态
		try {// 执行获得的SQL语句
			laneoutDao.insertLaneoutRecords(literaries);
		} catch (SQLException e) {// 如果出现异常，需要给出错误提示
			result.setStatus("failure");
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 上报交接班信息
	 */
	@Override
	public WSResult uploadOTimeNew(Insertliterary literaries) {
		WSResult result = new WSResult();// 默认为success状态
		try {// 执行获得的SQL语句
			otimeDao.insertOTimeRecords(literaries);
		} catch (SQLException e) {// 如果出现异常，需要给出错误提示
			result.setStatus("failure");
			result.setMessage(e.getMessage());
		}
		return result;
	}
}
