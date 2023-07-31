package com.example.calc.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.calc.domain.EquationLog;

public interface EquationLogRepository extends JpaRepository<EquationLog,Integer>{
@Query(value = "select * from equation_log where personal_id = ?1", nativeQuery = true)
List<EquationLog> findById(int id);
}