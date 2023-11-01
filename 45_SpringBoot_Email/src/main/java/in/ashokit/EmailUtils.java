package in.ashokit;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtils {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendEmailWithAttachment() throws Exception{

		MimeMessage mimeMsg = mailSender.createMimeMessage();
		
		MimeMessageHelper helper = new MimeMessageHelper(mimeMsg);
		helper.setTo("ashokitschool@gmail.com");
		helper.setSubject("Hi");
		helper.setText("hello");
		helper.addAttachment("Report", new File(""));
		
		mailSender.send(mimeMsg);

	}

	public void sendEmail() {

		SimpleMailMessage msg = new SimpleMailMessage();
		
		msg.setTo("ashokitschool@gmail.com");
		msg.setSubject("Spring Boot - Email");
		msg.setText("This is test body");
		
		mailSender.send(msg);

	}

}
