package com.rest.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.emp.model.EmpModel;
import com.rest.emp.service.EmpServiceImpl;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = {"http://localhost:5173/"})
public class EmpController {
	
	@Autowired
	private EmpServiceImpl empServiceImpl;
	
	@PostMapping("/employees")
	public EmpModel addEmp(@RequestBody EmpModel empModel) {
		EmpModel saveData=empServiceImpl.saveEmployee(empModel);
		return saveData;
	}
	@GetMapping("/employees")
	public List<EmpModel> allEmployeeDetails(){
		List<EmpModel> dataEmp=empServiceImpl.getAllEmp();
		return dataEmp;
	}
	@PutMapping("/employees/{id}")
	public EmpModel updateOneRecord(@PathVariable Long id,@RequestBody EmpModel empModel) {
		EmpModel updateData=empServiceImpl.updateEmployee(id,empModel);
		return updateData;
	}
	@GetMapping("/employees/{id}")
	public EmpModel getRecord(@PathVariable Long id) {
		EmpModel getOneRecord=empServiceImpl.getOneEmployee(id);
		return getOneRecord;
	}
	@DeleteMapping("/employees/{id}")
	public void deleteOneRecord(@PathVariable Long id) {
		 empServiceImpl.deleteOneEmployee(id);
		
	}

}
