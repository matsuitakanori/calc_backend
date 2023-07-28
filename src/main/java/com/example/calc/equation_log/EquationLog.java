package com.example.demodemodemo.equation_log;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="equation_log")
public class EquationLog{

    //@Id
    //@ManyToOne
    //@JoinColumn(name="personal_id")
    //private PersonalInformation personal_information;

    @Id
    @Column(name="personal_id")
    private int personal_id;

    @Column(name="equation")
    private String equation;

    @Column(name="result")
    private String result;

    @Column(name="summit_date")
    private LocalDateTime summit_date;
    
}