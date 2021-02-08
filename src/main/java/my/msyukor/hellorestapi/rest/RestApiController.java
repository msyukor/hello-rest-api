package my.msyukor.hellorestapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.msyukor.hellorestapi.entity.Employee;
import my.msyukor.hellorestapi.service.EmployeeService;


@RestController
@RequestMapping("/api")
public class RestApiController {

	@Value( "${info.app.version}" )
	private String appVersion;
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/")
	public String helloWorld() {
		return "MyAPI version " + appVersion;
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmpoyees() {
		return employeeService.getAllEmployees();
	}

}
