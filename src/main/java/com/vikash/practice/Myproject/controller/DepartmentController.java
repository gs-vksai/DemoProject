package com.vikash.practice.Myproject.controller;

import com.vikash.practice.Myproject.entity.Department;
import com.vikash.practice.Myproject.service.DepartmentService;
import com.vikash.practice.Myproject.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController
{
    @Autowired
    private  DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDept(@RequestBody Department department){
         Department department1;
         department1 = departmentService.saveDepts(department);
        return department1;
    }

}
