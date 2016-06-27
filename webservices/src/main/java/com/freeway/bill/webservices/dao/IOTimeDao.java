package com.freeway.bill.webservices.dao;

import com.freeway.bill.webservices.beans.Insertliterary;
import com.freeway.bill.webservices.messages.FeedBack;

public interface IOTimeDao {
	public FeedBack insertOTimeRecords(Insertliterary insertLiteraries);
}
