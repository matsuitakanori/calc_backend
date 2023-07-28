package com.example.demodemodemo.personal_information;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

import com.example.demodemodemo.equation_log.EquationLog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="personal_information")
public class PersonalInformation {
   
    
    //@ManyToOne
    //@JoinColumn(name="id")
    //private EquationLog equation_log;

    @Id
    @Column(name="id")
    private int id;
 
    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;
    
}