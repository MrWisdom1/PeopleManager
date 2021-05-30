package com.cdp.controller;

import com.cdp.model.Department;
import com.cdp.service.DepartmentService;
import com.cdp.utils.MapController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/showDepartment")
    @ResponseBody
    public Map<String,Object> showAllDepartment(@RequestBody Department department, Model model){
        System.out.println(department.getD_name());
        List<Department> departments = departmentService.selectAllDepartment(department);
        Integer count = departmentService.count(department);
        return MapController.getInstance().success().page(departments,count).getMap();
    }
}
