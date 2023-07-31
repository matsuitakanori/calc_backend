package com.example.calc.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.calc.domain.EquationLog;
import com.example.calc.repository.EquationLogRepository;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class EquationLogController {
    @Autowired
    private EquationLogRepository repository;

    @GetMapping("/equation_log")
    public List<EquationLog> getAllEquationLog(){
        List<EquationLog> equationlog = repository.findAll();
        return equationlog;
    }

    @GetMapping("/getequatationlogById/{id}")
    public List<EquationLog> getEquatationLog(@PathVariable int id){
        List<EquationLog> personalinformation = repository.findById(id);
        return personalinformation;
    }
    
}
