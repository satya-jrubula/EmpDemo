package com.example.Empdemo.EmpService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Empdemo.EmpRepo.EmpRepo;
import com.example.Empdemo.EmpRepo.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	@Autowired
	EmpRepo ep;
	
	@Transactional
	public void createEmployee(Employee emp)
	{
		ep.save(emp);
	}
	public Employee getEmployee(Integer id)
	{
		Employee e=ep.getById(id);
		return e;
	}
	public void deleteEmployee(Integer id)
	{
		ep.deleteById(id);
	}
	public List<Employee>readEmployee()
	{
		return ep.findAll();
	}
}
