package prom.it.service;

import prom.it.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);
    Boolean deleteEmployee(Long id);
    Employee getById(Long id);
    Employee updateEmployee(Employee employee);
    List<Employee> getAll();

}
