package com.hhz.demo.dao;

import com.hhz.demo.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<SysUser,Integer>,JpaSpecificationExecutor<SysUser>{


}
