package com.example.email.controller;

import com.example.email.model.Email;
import com.example.email.service.emailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class emailController {

    private final emailService emailService;


//    public emailController(com.example.email.service.emailService emailService) {
//        this.emailService = emailService;
//    }
//
//    @PostMapping("/Email/{toEmail}/send/{toSubject}/{body}")
//    public void sendEmail(@PathVariable String toEmail, @PathVariable String toSubject , @PathVariable String body)
//    {
//        sendEmail(toEmail,toSubject,body);
//    }

    @Autowired
    public emailController(emailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/sendEmail")
    public void sendEmail(@PathVariable String toEmail,
                          @PathVariable String toSubject,
                          @PathVariable String body) {
        Email email = new Email(toEmail, toSubject, body);
        emailService.sendEmail(email);
    }
}
