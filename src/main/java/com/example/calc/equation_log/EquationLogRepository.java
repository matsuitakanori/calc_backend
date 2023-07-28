package com.example.demodemodemo.equation_log;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EquationLogRepository extends JpaRepository<EquationLog,Integer>{

    @Query(value="select * from equation_log", nativeQuery = true)
    List<EquationLog> findAll2();

    

}