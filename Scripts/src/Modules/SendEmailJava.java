package Modules;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailJava {
	
      public static void main(String[] args) throws EmailException  {
    	  
    	  
    	  System.out.println("........started........");
    	  
    	  
    	  Email email = new SimpleEmail();
    	  email.setHostName("smtp.gmail.com");
    	  email.setSmtpPort(465);

    	 // email.setAuthenticator(new DefaultAuthenticator("karthikeyanp@znodtech.com", "Temp#123"));

    	  email.setAuthenticator(new DefaultAuthenticator("karthikeyanp@znodtech.com", "Temp#123"));

    	  email.setSSLOnConnect(true);
    	  email.setFrom("karthikeyanp@intentsg.com");
    	  email.setSubject("TestMail");
    	  email.setMsg("This is a test mail ... :-)");
    	  email.addTo("karthidk20@gmail.com");
    	  email.send();
    	  
    	  System.out.println(".....end......");
      }
}
