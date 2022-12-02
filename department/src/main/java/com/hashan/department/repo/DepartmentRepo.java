package com.hashan.department.repo;

import com.hashan.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {
    @Query(value = "SELECT * FROM Department WHERE  department_Id=?1",nativeQuery = true)
    Department findDepartmentById(Long departmentId);
}
