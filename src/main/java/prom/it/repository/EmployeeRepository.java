package prom.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prom.it.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
