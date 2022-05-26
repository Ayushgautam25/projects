package com.transaction.SpringTransactionDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.SpringTransactionDemo.entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long>{

}
