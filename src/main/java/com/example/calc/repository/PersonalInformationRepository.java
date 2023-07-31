package com.example.calc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.calc.domain.PersonalInformation;

public interface PersonalInformationRepository extends JpaRepository<PersonalInformation,Integer>{
}