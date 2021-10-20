package com.bridgelabs.Greeting_App.dto;

import lombok.Data;

import javax.persistence.Id;

@Data
public class GreetingAppDto {
    @Id
    private  int id;
    private String firstname;
    private String lastname;
}

