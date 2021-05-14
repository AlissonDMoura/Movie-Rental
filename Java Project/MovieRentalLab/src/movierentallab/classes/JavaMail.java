/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentallab.classes;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author mvini
 */
public class JavaMail {
     private String emailTo;



    public JavaMail(){}

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailto) {
        this.emailTo = emailTo;
    }

    public void validEmail(String email) throws Exception{
        if(!email.trim().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")){
            throw new Exception ("this is NOT a valid e-mail");
        }
    }


    public void sendEmail(String emailTo){
       Properties props = new Properties();
    // Connection parameter with the Gmail server
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.socketFactory.class",
    "javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.port", "465");

    Session session = Session.getDefaultInstance(props,
      new javax.mail.Authenticator() {
           protected PasswordAuthentication getPasswordAuthentication()
           {
                 return new PasswordAuthentication("xtravisionrental@gmail.com",
                 "xtravision123");
           }
      });

    //debug for this part
    session.setDebug(true);

    try {

      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress("xtravisionrental@gmail.com"));
      //Xtra-Vision email

      Address[] toUser = InternetAddress //Recipient of the email
                 .parse(emailTo);

      message.setRecipients(Message.RecipientType.TO, toUser);
      message.setSubject("Your Xtra-Vision Receipt");//Subject
      message.setText("This is your Xtra-Vision receipt as requested");
      //Method to send the email
      Transport.send(message);

      System.out.println("EMAIL SENT!");

     } catch (MessagingException e) {
        throw new RuntimeException(e);
    }
    
    
    }
    
    
    
    
    
    
    

    
}


//https://www.devmedia.com.br/enviando-email-com-javamail-utilizando-gmail/18034