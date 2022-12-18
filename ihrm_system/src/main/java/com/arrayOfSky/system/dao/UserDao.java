package com.arrayOfSky.system.dao;

import com.arrayOfSky.domain.system.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author GYF
 */
public interface UserDao extends JpaRepository<User, String>, JpaSpecificationExecutor<User> {


}
