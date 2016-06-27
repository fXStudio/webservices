package com.freeway.bill.webservices.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.freeway.bill.webservices.beans.Insertliterary;
import com.freeway.bill.webservices.dao.IOTimeDao;

/**
 * 交接班表数据上传
 * 
 * @author Ajaxfan
 */
@Repository("otimeDao")
final class OTimeDao implements IOTimeDao {
	/** 数据库连接 */
	private @Autowired DataSource dataSource;

	@Override
	public void insertOTimeRecords(Insertliterary insertLiteraries) throws SQLException {
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = dataSource.getConnection();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();

			for (String sql : insertLiteraries.getLiteraris()) {
				stmt.addBatch(sql);
			}
			stmt.executeBatch();
			conn.commit();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} finally {
					stmt = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} finally {
					conn = null;
				}
			}
		}
	}
}
