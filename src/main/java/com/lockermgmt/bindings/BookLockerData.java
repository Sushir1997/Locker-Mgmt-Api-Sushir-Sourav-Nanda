package com.lockermgmt.bindings;

import lombok.Data;

@Data
public class BookLockerData {
	private Integer userId;
	private String lockerName;
	private String lockerPassword;

}
