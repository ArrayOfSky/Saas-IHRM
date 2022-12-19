package com.arrayOfSky.domain.company.response;

import com.arrayOfSky.domain.company.Company;
import com.arrayOfSky.domain.company.Department;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

/**
 * @author GYF
 */
@Getter
@Setter
@NoArgsConstructor
public class DeptListResult {
    //某公司 所有部门列表返回数据

    private String companyId;
    private String companyName;
    private String companyManage;
    private List<Department> depts;

    public DeptListResult(Company company, List<Department> list) {
        this.companyId = company.getId();
        this.companyName = company.getName();
        this.companyManage = company.getLegalRepresentative();
        this.depts = list;
    }

}
