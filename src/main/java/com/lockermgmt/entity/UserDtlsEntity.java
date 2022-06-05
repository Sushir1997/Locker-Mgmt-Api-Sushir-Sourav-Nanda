package com.lockermgmt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="USER_DTLS")
public class UserDtlsEntity {
	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private Integer userId;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="LOCKER_NAME")
	private String lockerName;
	@Column(name="LOCKER_PASSWORD")
	private String lockerPassword;
}
