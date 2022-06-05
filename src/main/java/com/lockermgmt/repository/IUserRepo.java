package com.lockermgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lockermgmt.entity.UserDtlsEntity;

public interface IUserRepo extends JpaRepository<UserDtlsEntity, Integer> {

}
