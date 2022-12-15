package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailsenderApplication {

	/*
	@Autowired
	private EmailSenderService emailSenderService;
	*/

	public static void main(String[] args) {
		SpringApplication.run(EmailsenderApplication.class,args);
	}

	/*
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		emailSenderService.mailSender("musluhan01@hotmail.com","First Mail","Hi. This my first mail");
	}
	*/

}
