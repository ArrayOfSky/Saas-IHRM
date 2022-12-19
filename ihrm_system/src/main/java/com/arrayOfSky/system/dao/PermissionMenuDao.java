package com.arrayOfSky.system.dao;




import com.arrayOfSky.domain.system.PermissionMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 企业数据访问接口
 * @author GYF
 */
public interface PermissionMenuDao extends JpaRepository<PermissionMenu, String>, JpaSpecificationExecutor<PermissionMenu> {

}