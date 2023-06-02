package com.xworkz.adhar.utile;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtil {

public static boolean sendEmail(String email,String fName,String lName) {
		
		String host="smtp.office365.com";
		final String user="rakheshluppar@outlook.com";
		final String password="2lb16cv033";
		String to= email;
		
		
		Properties props= new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.debug", "true");
		props.put("mail.transport.protocal", "smtp");
		
		Session session=Session.getDefaultInstance(props, null);	
		try {
			MimeMessage message=new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Registration Confirmation Email");
			message.setText("Hi I am:"+fName+""+lName+" ");
			
			Transport.send(message,user,password);
			
		} catch (MessagingException e) {
		  e.printStackTrace();
		}
		return true;
	}
}
