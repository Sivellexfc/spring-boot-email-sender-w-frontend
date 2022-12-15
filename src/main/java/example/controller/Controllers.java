package example.controller;

import example.services.EmailSenderService;
import example.users.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controllers {

    private EmailSenderService emailSenderService;

    public Controllers(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/contact")
    public String post(@ModelAttribute("user") User user){
        System.out.println("POST YAPILDI");
        System.out.println("email : " + user.getEmail());
        System.out.println("name : " + user.getName());
        System.out.println("text : " + user.getMessage());
        emailSenderService.mailSender(
                user.getEmail(),
                user.getName(),
                user.getMessage());

        return "okay";
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @GetMapping("/okay")
    public String listStudent(User user){
        System.out.println("OKAY'E GET YAPILDI");
        User user2 = new User(user.getName(), user.getEmail(), user.getMessage());
        emailSenderService.mailSender(
                user2.getEmail(),
                user2.getName(),
                user2.getMessage());
        System.out.println("OKKKKKKKKKKKKKKKKKKK");
        return "okay";
    }

    @GetMapping("/contact")
    public String getContact(Model model){
        System.out.println("/CONTACT'A GET YAPILDI");
        User user = new User();
        model.addAttribute("user",user);
        return "contact";
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
