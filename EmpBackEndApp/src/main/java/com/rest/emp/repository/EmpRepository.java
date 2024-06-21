package com.rest.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.emp.model.EmpModel;
@Repository
public interface EmpRepository extends JpaRepository<EmpModel,Long>{

}
