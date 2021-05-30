package com.cdp.dao;

import com.cdp.model.Department;

import java.util.List;
import java.util.Map;

public interface DepartmentDao {
    /**
     * 显示所有部门
     * @return
     */
    List<Department> selectAllDepartment(Map<String,Object> paramMap);


    /**
     * 统计部门表中的数据
     * @return
     */
    public int count(Map<String,Object> paramMap);


}
