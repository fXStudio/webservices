package com.freeway.bill.webservices.services.impl;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.freeway.bill.webservices.mappers.DeptMapper;
import com.freeway.bill.webservices.mappers.PayrateMapper;
import com.freeway.bill.webservices.mappers.PersonMapper;
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
final class DataExportService implements IDataExportService {
	/** 费率查询服务 */
	private @Autowired PayrateMapper payrateMapper;
	/** 部门查询服务 */
	private @Autowired DeptMapper deptMapper;
	/** 人员查询服务 */
	private @Autowired PersonMapper personMapper;

	@Override
	public List<Person> getPersons() {
		return personMapper.getAllPerson();
	}

	@Override
	public List<Payrate> getPayrates() {
		return payrateMapper.getAllPayrate();
	}

	@Override
	public List<Dept> getDepts() {
		return deptMapper.getAllDept();
	}
}
