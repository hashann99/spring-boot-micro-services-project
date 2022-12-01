package com.hashan.department.service.impl;

import com.hashan.department.dto.DepartmentDto;
import com.hashan.department.entity.Department;
import com.hashan.department.repo.DepartmentRepo;
import com.hashan.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        log.info("Save Department !");
        Department department = modelMapper.map(departmentDto, Department.class);
        Department save = departmentRepo.save(department);
        return modelMapper.map(save,DepartmentDto.class);
    }
}
