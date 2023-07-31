package com.example.calc.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="personal_information")
public class PersonalInformation {

    // @OneToMany
    // @JoinColumn(name = "personal_information_id") 
    // private Set<EquationLog> equationLogs;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
 
    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    
    
}