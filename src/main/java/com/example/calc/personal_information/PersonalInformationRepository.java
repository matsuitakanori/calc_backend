package com.example.demodemodemo.personal_information;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonalInformationRepository extends JpaRepository<PersonalInformation,Integer>{

    @Query(value="select * from personal_information", nativeQuery = true)
    List<PersonalInformation> findAll2();

    

}