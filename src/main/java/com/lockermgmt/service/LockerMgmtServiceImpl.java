package com.lockermgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lockermgmt.bindings.BookLockerData;
import com.lockermgmt.bindings.UserCardDetails;
import com.lockermgmt.entity.LockerDtlsEntity;
import com.lockermgmt.entity.UserDtlsEntity;
import com.lockermgmt.repository.ILockerRepo;
import com.lockermgmt.repository.IUserRepo;

@Service
public class LockerMgmtServiceImpl implements ILockerMgmtService {

	@Autowired
	private ILockerRepo lockerRepo;
	@Autowired
	private IUserRepo userRepo;

	@Override
	public List<String> getLocker() {

		return lockerRepo.getAvailableLocker();
	}

	public String bookLocker(BookLockerData bookLockerData) {
		LockerDtlsEntity lockerEntity = lockerRepo.findByLockerName(bookLockerData.getLockerName());
		lockerEntity.setLockerPassword(bookLockerData.getLockerPassword());
		lockerEntity.setActiveLocker("occupied");
		
		UserDtlsEntity userEntity=userRepo.getById(bookLockerData.getUserId());
		userEntity.setLockerName(bookLockerData.getLockerName());
		userEntity.setLockerPassword(bookLockerData.getLockerPassword());

		return "Your Locker booked successfully";
	}

	@Override
	public String checkoutLocker(BookLockerData bookLockerData) {
		LockerDtlsEntity lockerEntity = lockerRepo.findByLockerName(bookLockerData.getLockerName());
		if (lockerEntity.getLockerPassword() == bookLockerData.getLockerPassword())
			lockerEntity.setActiveLocker("nonOccupied");
		
		UserDtlsEntity userEntity=userRepo.getById(bookLockerData.getUserId());
		userEntity.setLockerName(null);
		userEntity.setLockerPassword(null);
		
		return "You have successfully checked out for your Locker !! Please proceed for payment";
	}

	@Override
	public String makePayment(UserCardDetails userCardDetails) {
		
		//Payment related logics should be put here
		return "Your payment is successfull";
	}

}
