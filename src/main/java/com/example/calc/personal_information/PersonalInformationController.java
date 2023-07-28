package com.example.demodemodemo.personal_information;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@Controller
@CrossOrigin
@RestController
@RequestMapping("/api/personal_information")
public class PersonalInformationController {

    @Autowired
    private PersonalInformationRepository repository;

    @GetMapping("/all3")
    public List<PersonalInformation> getPersonalInformation(){
        List<PersonalInformation> personalinformation = repository.findAll2();
        return personalinformation;
    }

    @PostMapping("/insert")
    public PersonalInformation addEmployee(@RequestParam("name") String name, @RequestParam("email") String email) {
    PersonalInformation newEmployee = new PersonalInformation();
    newEmployee.setName(name);
    newEmployee.setEmail(email);
    return repository.save(newEmployee);
    }
    
    
}