package example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    public void mailSender(String toEmail,
                           String subject,
                           String body){

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("musluhan01@gmail.com");
        message.setSubject(subject + "size ulaşmak istiyor");
        message.setText(subject + "size bir mesaj bıraktı : \n" + body);
        message.setTo(toEmail);
        mailSender.send(message);
        System.out.println("Email sent succesfully...");
    }
}
