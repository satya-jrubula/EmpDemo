package com.example.Empdemo.EmpController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Empdemo.EmpRepo.Employee;
import com.example.Empdemo.EmpService.EmployeeService;

@RestController
public class EmpController {
	
	@Autowired
	EmployeeService es;
	@GetMapping("/")
	String home() {
		return "Hello World!";
	}
	
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable(value="id") Integer id)
	{
		return ResponseEntity.ok(es.getEmployee(id));
	}
	@GetMapping("/getEmpList")
	public ResponseEntity<List<Employee>> readEmployee()
	{
		List<Employee> e= es.readEmployee();
		return new ResponseEntity<>(e,HttpStatus.OK);
	}
	@PostMapping("/createEmp")
	public void createEmployee(@RequestBody Employee emp)
	{
		es.createEmployee(emp);
	}
	@DeleteMapping("/deleteEmp/{id}")
	public void deleteEmployee(@PathVariable(value="id") Integer id)
	{
		es.deleteEmployee(id);
	}
}

