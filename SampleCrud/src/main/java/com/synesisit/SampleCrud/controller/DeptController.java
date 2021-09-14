package com.synesisit.SampleCrud.controller;

import com.synesisit.SampleCrud.entity.Department;
import com.synesisit.SampleCrud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    DeptService deptService;

    @PostMapping("/dept")
    public Department addDepartment(@RequestBody Department department) {
        return deptService.save(department);
    }

    @GetMapping("/dept")
    public List<Department> getAllDept() {
        return deptService.getAllDept();
    }

    @DeleteMapping("/dept/{deptId}")
    public String deleteDept(@PathVariable String deptId) {
        deptService.delete(Long.parseLong(deptId));
        return "Deleted";
    }

    @PutMapping("/dept/{deptId}")
    public Department updateDept(@PathVariable("deptId") Long deptId, @RequestBody Department departmentRequest) {
        Department department = deptService.update(deptId,departmentRequest);
        return department;
    }


}
