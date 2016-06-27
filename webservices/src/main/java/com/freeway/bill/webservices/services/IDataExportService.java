package com.freeway.bill.webservices.services;

import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

import com.freeway.bill.webservices.models.Dept;
import com.freeway.bill.webservices.models.Payrate;
import com.freeway.bill.webservices.models.Person;

@SOAPBinding(parameterStyle = ParameterStyle.BARE)
@WebService
public interface IDataExportService {
	/**
	 * @return 人员信息
	 */
	public List<Person> getPersons();

	/**
	 * @return 费率
	 */
	public List<Payrate> getPayrates();

	/**
	 * @return 部门
	 */
	public List<Dept> getDepts();
}
