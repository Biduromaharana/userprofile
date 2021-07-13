package com.offs.pm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.offs.pm.entity.UserInfo;

@Repository
public interface UserRepositroy   extends JpaRepository<UserInfo, Integer> {

}
