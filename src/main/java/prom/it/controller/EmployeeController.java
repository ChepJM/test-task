package prom.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import prom.it.entity.Employee;
import prom.it.service.impl.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    /**
     * Returns list of all employees
     *
     * @return List<Employee>
     */
    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getAll();
    }

    /**
     * Add new employee
     *
     * @param employee new object
     * @return
     */
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {

        return employeeService.addEmployee(employee);
    }

    /**
     * Returns specified employee
     *
     * @param id unique identifier of employee
     * @return Employee
     */
    @GetMapping(params = "id")
    public Employee getEmployee(@RequestParam String id) {
        return employeeService.getById(Long.valueOf(id));
    }

    /**
     * Update specified employee
     *
     * @param employee object with edited values
     * @return Employee
     */
    @PatchMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    /**
     * Delete specified employee
     *
     * @param id unique identifier of employee
     * @return true in case of success, otherwise false
     */
    @DeleteMapping
    public Boolean deleteEmployee(@RequestParam String id) {
        return employeeService.deleteEmployee(Long.valueOf(id));
    }
}
