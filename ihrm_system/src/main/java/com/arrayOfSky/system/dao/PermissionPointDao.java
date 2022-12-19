package com.arrayOfSky.system.dao;




import com.arrayOfSky.domain.system.PermissionPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


/**
 * @author GYF
 */
public interface PermissionPointDao extends JpaRepository<PermissionPoint, String>, JpaSpecificationExecutor<PermissionPoint> {

}