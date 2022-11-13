package com.example.momondo.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class NameResponse {

    String name;
    String gender;
    double genderPropability;
    int age;
    int ageCount;
    String country;
    double countryPropability;

    public void setGenderPropability(double p){
        genderPropability = p*100;

    }
    public void setCountryPropability(double p){
        countryPropability = p*100;
    }
}
