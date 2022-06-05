package com.lockermgmt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lockermgmt.bindings.BookLockerData;
import com.lockermgmt.bindings.UserCardDetails;
import com.lockermgmt.service.ILockerMgmtService;

@RestController
public class LockerMgmtController {
	@Autowired
	private ILockerMgmtService service;
	
	
	@GetMapping("/getAvailableLocker")
	public List<String> getAvailableLockers() {
		return service.getLocker();
	}
	@PostMapping("/bookLocker")// user should give locker name and password in the body param
	public String bookLocker(@RequestBody BookLockerData bookLockerData) {
		return service.bookLocker(bookLockerData);
		
	}
	@PostMapping("/checkoutLocker")//user should give locker name and password in the body param
	public String checkoutLocker(@RequestBody BookLockerData bookLockerData) {
		return service.checkoutLocker(bookLockerData);
		
	}
	
	@PostMapping("/makePayment")
	public String makePayment(@RequestBody UserCardDetails userCardDetails) {
		return service.makePayment(userCardDetails);
		
	}

}
