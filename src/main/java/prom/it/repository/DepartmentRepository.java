package prom.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prom.it.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
