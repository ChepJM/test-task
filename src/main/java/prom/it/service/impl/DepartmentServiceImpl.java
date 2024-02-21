package prom.it.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prom.it.entity.Department;
import prom.it.repository.DepartmentRepository;
import prom.it.service.DepartmentService;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department addDepartment(Department department) {
        return departmentRepository.saveAndFlush(department);
    }

    @Override
    public Boolean deleteDepartment(Long id) {
        try {
            departmentRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Department getById(Long id) {
        Optional<Department> department = departmentRepository.findById(id);
        return department.orElseGet(Department::new);
    }

    @Override
    public Department updateDepartment(Department department) {
        return departmentRepository.saveAndFlush(department);
    }

    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }
}
