package prom.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prom.it.entity.Profession;

public interface ProfessionRepository extends JpaRepository<Profession, Long> {
}
