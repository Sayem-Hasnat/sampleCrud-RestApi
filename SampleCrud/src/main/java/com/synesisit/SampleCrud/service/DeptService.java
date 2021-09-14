package com.synesisit.SampleCrud.service;

import com.synesisit.SampleCrud.entity.Department;
import com.synesisit.SampleCrud.repository.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    DeptRepo deptRepo;


    public List<Department> getAllDept() {
        return deptRepo.findAll();
    }

    public Department save(Department department) {

        return deptRepo.save(department);
    }


    public void delete(long parseLong) {
        Department dept = deptRepo.getById(parseLong);
        deptRepo.delete(dept);
    }

    public Department update(Long deptId, Department departmentRequest) {
        Department dept = deptRepo.findById(deptId).get();
        dept.setDeptName(departmentRequest.getDeptName());
        dept.setDeptCode(departmentRequest.getDeptCode());
        return deptRepo.save(dept);

    }


}

