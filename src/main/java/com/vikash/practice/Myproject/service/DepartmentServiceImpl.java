package com.vikash.practice.Myproject.service;

import com.vikash.practice.Myproject.entity.Department;
import com.vikash.practice.Myproject.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements  DepartmentService
{
    @Autowired
    private  DepartmentRepository departmentRepository;


    @Override
    public Department saveDepts(Department department)
    {
        return  departmentRepository.save(department);
    }
}
