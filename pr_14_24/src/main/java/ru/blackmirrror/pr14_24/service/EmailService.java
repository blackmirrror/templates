package ru.blackmirrror.pr14_24.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class EmailService {

    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

    @Autowired
    private JavaMailSender mailSender;

    @Async
    public void sendSaveNotification(String objectName) {
        logger.debug("Sending email notification for object {}", objectName);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("petrushaekaterina@yandex.ru");
        message.setSubject("Object saved");
        message.setText("The object " + objectName + " has been saved.");
        mailSender.send(message);
    }
}
