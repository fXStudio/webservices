package com.freeway.bill.webservices.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.freeway.bill.webservices.beans.Insertliterary;
import com.freeway.bill.webservices.dao.IOTimeDao;
import com.freeway.bill.webservices.messages.FeedBack;

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
	public FeedBack insertOTimeRecords(Insertliterary insertLiteraries) {
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
		} catch (SQLException e) {
			e.printStackTrace();
			return new FeedBack(001, e.getMessage());
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					stmt = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					conn = null;
				}
			}
		}
		return new FeedBack(200, "数据上传成功");
	}
}
