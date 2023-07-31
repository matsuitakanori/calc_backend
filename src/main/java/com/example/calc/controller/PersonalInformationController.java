package com.example.calc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.calc.domain.PersonalInformation;
import com.example.calc.repository.PersonalInformationRepository;

@Controller
@CrossOrigin
@RestController
@RequestMapping("/api")
public class PersonalInformationController {

    @Autowired
    private PersonalInformationRepository repository;

    @GetMapping("/getallequatationlog")
    public List<PersonalInformation> getPersonalInformation(){
        List<PersonalInformation> personalinformation = repository.findAll();
        return personalinformation;
    }
    
    // @GetMapping("/getequatationlogById/{id}")
    // public Optional<PersonalInformation> getEquatationLog(@PathVariable int id){
    //     Optional<PersonalInformation> personalinformation = repository.findById(id);
    //     return personalinformation;
    // }

    // @PostMapping("/insert")
    // public PersonalInformation addEmployee(@RequestParam("name") String name, @RequestParam("email") String email) {
    // PersonalInformation newEmployee = new PersonalInformation();
    // newEmployee.setName(name);
    // newEmployee.setEmail(email);
    // return repository.save(newEmployee);
    // } 
}