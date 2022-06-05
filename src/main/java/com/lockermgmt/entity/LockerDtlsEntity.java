package com.lockermgmt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="LOCKER_DTLS")
public class LockerDtlsEntity {
	@Id
	@GeneratedValue
	@Column(name="LOCKER_CODE")
	private Integer lockerCode;
	@Column(name="LOCKER_NAME")
	private String lockerName;
	@Column(name="LOCKER_PASSWORD")
	private String lockerPassword;
	@Column(name="ACTIVE_LOCKER")
	private String activeLocker ;// either "occupied" or nonOccupied

}
