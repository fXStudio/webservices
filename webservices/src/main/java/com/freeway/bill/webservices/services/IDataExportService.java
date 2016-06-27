package com.freeway.bill.webservices.services;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.freeway.bill.webservices.models.Dept;
import com.freeway.bill.webservices.models.Payrate;
import com.freeway.bill.webservices.models.Person;

@WebService
@SOAPBinding(style=Style.RPC)
public interface IDataExportService {
	/**
	 * @return 人员信息
	 */
	public @WebResult(name = "persons") List<Person> getPersons();

	/**
	 * @return 费率
	 */
	public @WebResult(name = "payrates") List<Payrate> getPayrates();

	/**
	 * @return 部门
	 */
	public @WebResult(name = "departments") List<Dept> getDepts();
}
