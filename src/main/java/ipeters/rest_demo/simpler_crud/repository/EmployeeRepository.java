package ipeters.rest_demo.simpler_crud.repository;

import ipeters.rest_demo.simpler_crud.entity.EmployeeJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeJpaEntity, Long> {
}
