package com.example.email.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Email {


    private String toEmail;

    private String toSubject;

    private String body;

}
