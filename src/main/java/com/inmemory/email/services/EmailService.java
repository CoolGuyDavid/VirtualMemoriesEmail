package com.inmemory.email.services;

//email imports
import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.mail.Session;

public class EmailService {
public static void main(String[] args) {
	sendEmail();
}
	public static void sendEmail() {
		System.out.println("hey");
	String host = "imap.gmail.com";
	final String user = "straightouttalambda@gmail.com";
	final String password = "nextrevtech1997";
	System.out.println("hey");
	String to = "david@nextrevtech.com";
	System.out.println("hey");
	
	final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
	Properties props = System.getProperties();
    props.setProperty("mail.smtp.host", "smtp.gmail.com");
    props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
    props.setProperty("mail.smtp.socketFactory.fallback", "false");
    props.setProperty("mail.smtp.port", "465");
    props.setProperty("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.auth", "true");
    props.put("mail.debug", "true");
    props.put("mail.store.protocol", "pop3");
    props.put("mail.transport.protocol", "smtp");
	
	
	
//	Properties props = new Properties();
//	props.put("mail.smtp.host", host);
//	props.put("mail.smtp.auth","true");
	System.out.println("yo");
	//error
	Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(user,password);
		}
	});
	
	try {
		System.out.println("sup");
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(user));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		message.setSubject("Subject Test");
		message.setText("This is a simple test of emailing from Java.");
		System.out.println("5");
		//send
		Transport.send(message);
		System.out.println("6");
		System.out.println("Successful");
		
	} catch(MessagingException e) {e.printStackTrace();}
	
	
	}	
	
	public static void sendEmailNew() {
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		  // Get a Properties object
		     Properties props = System.getProperties();
		     props.setProperty("mail.smtp.host", "smtp.gmail.com");
		     props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		     props.setProperty("mail.smtp.socketFactory.fallback", "false");
		     props.setProperty("mail.smtp.port", "465");
		     props.setProperty("mail.smtp.socketFactory.port", "465");
		     props.put("mail.smtp.auth", "true");
		     props.put("mail.debug", "true");
		     props.put("mail.store.protocol", "pop3");
		     props.put("mail.transport.protocol", "smtp");
		     final String username = "straightouttalambda@gmail.com";//
		     final String password = "nextrevtech1997";
		     try{
		     Session session = Session.getDefaultInstance(props, 
		                          new Authenticator(){
		                             protected PasswordAuthentication getPasswordAuthentication() {
		                                return new PasswordAuthentication(username, password);
		                             }});

		   // -- Create a new message --
		     Message msg = new MimeMessage(session);

		  // -- Set the FROM and TO fields --
		     msg.setFrom(new InternetAddress("xxxx@gmail.com"));
		     msg.setRecipients(Message.RecipientType.TO, 
		                      InternetAddress.parse("user120@example.com",false));
		     msg.setSubject("Hello");
		     msg.setText("How are you");
		     //msg.setSentDate(new Date());
		     Transport.send(msg);
		     System.out.println("Message sent.");
		  }catch (MessagingException e){ System.out.println("Erreur d'envoi, cause: " + e);}
		  
	}
}
