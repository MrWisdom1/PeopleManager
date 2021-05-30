package com.cdp.service;

import com.cdp.model.Department;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    /**
     * 显示所有部门
     * @return
     */
    List<Department> selectAllDepartment(Department department);

    public int count(Department department);
}
