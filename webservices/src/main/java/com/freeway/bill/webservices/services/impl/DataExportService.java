package com.freeway.bill.webservices.services.impl;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.freeway.bill.webservices.mappers.PayrateMapper;
import com.freeway.bill.webservices.models.Dept;
import com.freeway.bill.webservices.models.Payrate;
import com.freeway.bill.webservices.models.Person;
import com.freeway.bill.webservices.services.IDataExportService;

/**
 * 数据导出服务
 * 
 * @author Ajaxfan
 */
@Component("DataExportService")
@WebService(endpointInterface = "com.freeway.bill.webservices.services.IDataExportService")
public class DataExportService implements IDataExportService {
	/** 费率查询服务 */
	private @Autowired PayrateMapper payrateMapper;

	@Override
	public List<Person> getPersons() {
		return null;
	}

	@Override
	public List<Payrate> getPayrates() {
		return payrateMapper.getAllPayrates();
	}

	@Override
	public List<Dept> getDepts() {
		return null;
	}
}
