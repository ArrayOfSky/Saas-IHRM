package com.arrayOfSky.system.dao;




import com.arrayOfSky.domain.system.PermissionApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *企业数据访问接口
 * @author GYF
 */
public interface PermissionApiDao extends JpaRepository<PermissionApi, String>, JpaSpecificationExecutor<PermissionApi> {

}