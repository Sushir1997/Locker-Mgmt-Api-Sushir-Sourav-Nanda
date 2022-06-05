package com.lockermgmt.bindings;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;

@Data
public class UserCardDetails {
	private Integer userId;
	private Integer cardNumber;
	private   Integer cardName;
	private  Date expiryDate;
	private Integer cvv;
	
}
