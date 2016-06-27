package com.freeway.bill.webservices.dao;

import java.sql.SQLException;

import com.freeway.bill.webservices.beans.Insertliterary;

public interface IOTimeDao {
	public void insertOTimeRecords(Insertliterary insertLiteraries) throws SQLException;
}
