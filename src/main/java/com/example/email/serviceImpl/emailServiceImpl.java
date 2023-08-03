package com.example.email.serviceImpl;

import com.example.email.model.Email;
import com.example.email.service.emailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class emailServiceImpl implements emailService {


    @Autowired
    private JavaMailSender mailSender;


    public emailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }


    public void sendEmail(String toEmail, String toSubject, String body)
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("nupur01joshi@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(toSubject);

        mailSender.send(message);

        System.out.println("Mail Sent successfully!");

    }
    public void sendEmail(Email email) {
        sendEmail(email.getToEmail(), email.getToSubject(), email.getBody());
    }
}




