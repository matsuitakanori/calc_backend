package com.example.demodemodemo.equation_log;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/equation_log")
public class EquationLogController {
    @Autowired
    private EquationLogRepository repository;

    @GetMapping("/all2")
    public List<EquationLog> getAllEquationLog(){
        List<EquationLog> equationlog = repository.findAll2();
        return equationlog;
    }
    
}
