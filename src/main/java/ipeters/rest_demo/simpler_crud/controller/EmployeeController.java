package ipeters.rest_demo.simpler_crud.controller;

import ipeters.rest_demo.simpler_crud.entity.EmployeeJpaEntity;
import ipeters.rest_demo.simpler_crud.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/* carlpeters created on 30/12/2024 inside the package - ipeters.rest_demo.simpler_crud.controller */
@RestController
@RequestMapping("/simple-crud/app-api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/all")
    public List<EmployeeJpaEntity> findAll() {
//        log.debug("findAll");
        return employeeService.findAllEmployees();
    }

    @PostMapping("/create")
    public EmployeeJpaEntity createEmployee(@RequestBody EmployeeJpaEntity employee){
//        log.debug("create new Employee");
        return employeeService.save(employee);
    }

}
