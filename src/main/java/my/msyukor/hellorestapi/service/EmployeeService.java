package my.msyukor.hellorestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.msyukor.hellorestapi.entity.Employee;
import my.msyukor.hellorestapi.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public void save(Employee employee) {
		employeeRepo.save(employee);
	}
	
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
		
	}
	
	public Employee getEmployee(int employeeId) {
		Employee searchedEmployee = null;
		Optional<Employee> currentEmployee = employeeRepo.findById(employeeId);
		if (currentEmployee.isPresent()) {
			searchedEmployee = currentEmployee.get();
		}
		else {
			throw new RuntimeException("COuld not find employee with ID " + employeeId);
		}
		
		return searchedEmployee;
	}
	
	public void deleteEmployee(int employeeId) {
		
	}
	
}
