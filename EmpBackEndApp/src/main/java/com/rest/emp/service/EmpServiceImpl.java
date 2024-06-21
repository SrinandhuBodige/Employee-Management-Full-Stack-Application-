package com.rest.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.emp.model.EmpModel;
import com.rest.emp.repository.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpRepository empRepository;

	@Override
	public EmpModel saveEmployee(EmpModel employee) {
		// TODO Auto-generated method stub
		EmpModel dataSave=empRepository.save(employee);
		return dataSave;
	}

	@Override
	public List<EmpModel> getAllEmp() {
		// TODO Auto-generated method stub
		List<EmpModel> emp=empRepository.findAll();
		return emp;
	}

	@Override
	public EmpModel updateEmployee(Long id, EmpModel empModel) {
		// TODO Auto-generated method stub
		EmpModel getOneRecord=empRepository.findById(id).get();
		
		getOneRecord.setName(empModel.getName());
		getOneRecord.setMobileNo(empModel.getMobileNo());
		getOneRecord.setEmpId(empModel.getEmpId());
		getOneRecord.setEmpMail(empModel.getEmpMail());
		
		return empRepository.save(getOneRecord);
	}

	@Override
	public EmpModel getOneEmployee(Long id) {
		// TODO Auto-generated method stub
		EmpModel empData=empRepository.findById(id).get();
		return empData;
	}

	@Override
	public void deleteOneEmployee(Long id) {
		// TODO Auto-generated method stub
		empRepository.deleteById(id);
		
	}

	

}
