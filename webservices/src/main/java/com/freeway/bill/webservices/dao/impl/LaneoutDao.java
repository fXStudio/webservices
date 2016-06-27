package com.freeway.bill.webservices.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.freeway.bill.webservices.beans.Insertliterary;
import com.freeway.bill.webservices.dao.ILaneoutDao;

/**
 * 车流量数据上传
 * 
 * @author Ajaxfan
 */
@Repository("laneoutDao")
final class LaneoutDao implements ILaneoutDao {
	/** 数据库连接 */
	private @Autowired DataSource dataSource;

	/** 日志工具 */
	private Logger logcase = LoggerFactory.getLogger("com.freeway.bill.webservices");

	@Override
	public void insertLaneoutRecords(Insertliterary insertLiteraries) throws SQLException {
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = dataSource.getConnection();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();

			logcase.info("------------------------------Web Request Start-------------");
			for (String sql : insertLiteraries.getLiteraris()) {
				stmt.addBatch(sql);
				logcase.info(sql);
			}
			logcase.info("------------------------------Web Request End-------------");
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
