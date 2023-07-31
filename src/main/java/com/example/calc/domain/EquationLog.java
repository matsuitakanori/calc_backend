package com.example.calc.domain;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name="personal_id")
    private PersonalInformation personalInformation;
    // @Column(name="personal_information_id")
    // private int personalInformationId;

    @Column(name="equation")
    private String equation;

    @Column(name="result")
    private String result;

    @Column(name="summit_date")
    private LocalDateTime summitDate;
}