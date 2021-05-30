package com.cdp.service.impl;

import com.cdp.dao.DepartmentDao;
import com.cdp.model.Department;
import com.cdp.service.DepartmentService;
import com.cdp.utils.BeanMapUtils;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;


    @Override
    public List<Department> selectAllDepartment(Department department) {
        Map<String,Object> map = BeanMapUtils.beanToMap(department);
        return departmentDao.selectAllDepartment(map);
    }


    @Override
    public int count(Department department) {
        Map<String,Object> map = BeanMapUtils.beanToMap(department);
        return departmentDao.count(map);
    }
}
