package com.app.dev;
import static com.app.util.PropertiesFile.getProperties;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailService {
	public static boolean sendEmail(String toAddr, String subject, String text) {
		
		boolean isMailSent=true;
		final String username=getProperties().getProperty("username");
		final String password=getProperties().getProperty("password");
		
		Properties props=new Properties();
		props.put(getProperties().getProperty("AuthKey"), getProperties().getProperty("AuthVal"));
		props.put(getProperties().getProperty("TLSKey"), getProperties().getProperty("TLSVal"));
		props.put(getProperties().getProperty("HostKey"), getProperties().getProperty("HostVal"));
		props.put(getProperties().getProperty("PortKey"), getProperties().getProperty("PortVal"));
		
		Session session=Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(username, password);
				}
			});
		try
		{
			Message message=new MimeMessage(session);
			message.setFrom(new InternetAddress(getProperties().getProperty("username")));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddr));
			message.setSubject(subject);
			message.setText(text);
			Transport.send(message);
			System.out.println("Done");
			
			
		}catch(Exception e) {
			isMailSent=false;
			e.printStackTrace();
		}
		return isMailSent;
				
	}
}
