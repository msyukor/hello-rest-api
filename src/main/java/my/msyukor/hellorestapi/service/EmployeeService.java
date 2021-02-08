package my.msyukor.hellorestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.msyukor.hellorestapi.entity.Employee;
import my.msyukor.hellorestapi.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public void save() {
		
	}
	
	public List<Employee> getAllEmployees() {
		return null;
		
	}
	
	public Employee getEmployee(int employeeId) {
		return null;
		
	}
	
	public void deleteEmployee(int employeeId) {
		
	}
	
}
