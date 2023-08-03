package com.example.email.service;

import com.example.email.model.Email;

public interface emailService {
    void sendEmail(String to, String subject, String body);

    void sendEmail(Email email);
}
