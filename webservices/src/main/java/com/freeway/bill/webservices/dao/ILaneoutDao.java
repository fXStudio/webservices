package com.freeway.bill.webservices.dao;

import java.sql.SQLException;

import com.freeway.bill.webservices.beans.Insertliterary;

public interface ILaneoutDao {
	public void insertLaneoutRecords(Insertliterary insertLiteraries) throws SQLException;
}
