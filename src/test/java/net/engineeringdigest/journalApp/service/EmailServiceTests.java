package net.engineeringdigest.journalApp.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {
    @Autowired
    private EmailService emailService;

    @Disabled
    @Test
    void testSendMail(){
        emailService.sendEmail("omkarmele@zohomail.in","Testing java mail sender" , "Hi dear kaise ho");
    }
}
