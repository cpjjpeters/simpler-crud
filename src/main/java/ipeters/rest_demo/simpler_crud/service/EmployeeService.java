package ipeters.rest_demo.simpler_crud.service;

import ipeters.rest_demo.simpler_crud.entity.EmployeeJpaEntity;
import ipeters.rest_demo.simpler_crud.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/* carlpeters created on 30/12/2024 inside the package - ipeters.rest_demo.simpler_crud.service */
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeJpaEntity> findAllEmployees() {
        return this.employeeRepository.findAll();
    }

    public EmployeeJpaEntity save(EmployeeJpaEntity employee) {
        return this.employeeRepository.save(employee);
    }
}
