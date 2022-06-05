package com.lockermgmt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lockermgmt.entity.LockerDtlsEntity;



public interface ILockerRepo extends JpaRepository<LockerDtlsEntity, Integer> {
	@Query("select LOCKER_NAME from LOCKER_DTLS where ACTIVE_LOCKER in ('occupied')")
	public List<String> getAvailableLocker();
	
	public  LockerDtlsEntity findByLockerName(String lockerName);

}
