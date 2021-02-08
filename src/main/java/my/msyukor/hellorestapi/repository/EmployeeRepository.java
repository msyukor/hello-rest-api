package my.msyukor.hellorestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import my.msyukor.hellorestapi.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
