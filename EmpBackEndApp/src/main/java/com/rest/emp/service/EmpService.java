package com.rest.emp.service;

import java.util.List;

import com.rest.emp.model.EmpModel;

public interface EmpService {
	//add employee details
	public EmpModel saveEmployee(EmpModel employee);
	
	public List<EmpModel> getAllEmp();
	
	//update one employee details
	public EmpModel updateEmployee(Long id,EmpModel empModel);
	
	//get one record
	public EmpModel getOneEmployee(Long id);
	
	//delete record
	public void deleteOneEmployee(Long id);

}
