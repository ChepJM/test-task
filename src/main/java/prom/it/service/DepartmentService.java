package prom.it.service;

import prom.it.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department addDepartment(Department department);
    Boolean deleteDepartment(Long id);
    Department getById(Long id);
    Department updateDepartment(Department department);
    List<Department> getAll();

}
