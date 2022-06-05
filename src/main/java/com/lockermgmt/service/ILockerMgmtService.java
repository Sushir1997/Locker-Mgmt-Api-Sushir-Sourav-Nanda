package com.lockermgmt.service;

import java.util.List;

import com.lockermgmt.bindings.BookLockerData;
import com.lockermgmt.bindings.UserCardDetails;

public interface ILockerMgmtService {
	public List<String> getLocker();

	public String bookLocker(BookLockerData bookLockerData);

	public String checkoutLocker(BookLockerData bookLockerData);
	
	public String makePayment(UserCardDetails userCardDetails);

}
