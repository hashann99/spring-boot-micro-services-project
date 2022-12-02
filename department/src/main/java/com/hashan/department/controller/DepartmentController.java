package com.hashan.department.controller;

import com.hashan.department.dto.DepartmentDto;
import com.hashan.department.entity.Department;
import com.hashan.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/departments")
@RestController
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public DepartmentDto saveDepartment(@RequestBody DepartmentDto departmentDto){
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(departmentDto);
    }

    @GetMapping("/{id}")
    public DepartmentDto findDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.findDepartmentById(departmentId);
    }

}
