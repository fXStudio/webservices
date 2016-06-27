package com.freeway.bill.webservices.services;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;

import com.freeway.bill.webservices.models.Dept;
import com.freeway.bill.webservices.models.Payrate;
import com.freeway.bill.webservices.models.Person;

@WebService
public interface IDataExportService {
	/**
	 * @return 人员信息
	 */
	public @WebResult(name = "person") List<Person> getPersons();

	/**
	 * @return 费率
	 */
	public @WebResult(name = "payrate") List<Payrate> getPayrates();

	/**
	 * @return 部门
	 */
	public @WebResult(name = "dept") List<Dept> getDepts();
}
