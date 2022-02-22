package com.javaproject.freelancingapp.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;
    
    public void sendMail(String receiv, String object, String body) throws MessagingException{

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        //mimeMessage.setFrom("compt0for9test@gmail.com");
        //MimeMessageHelper mimMesHelp = new MimeMessageHelper(mimeMessage);
        MimeMessageHelper mimMesHelp = new MimeMessageHelper(mimeMessage, true);
        mimMesHelp.setFrom("compt0for9test@gmail.com");
        mimMesHelp.setTo(receiv);
        mimMesHelp.setText(body, true);
        mimMesHelp.setSubject(object);

        javaMailSender.send(mimeMessage);
        System.out.println("Mail envoye avec succes!!!");
    }
    //spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
    
}
