package com.inmemory.email;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.inmemory.email.model.UserToCheck;
import com.inmemory.email.services.EmailService;
import com.inmemory.email.utils.HibernateUtils;
import com.inmemory.email.services.EmailSenderSES;
import com.inmemory.email.model.Email;
import com.inmemory.email.model.EmailList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmailHandler implements RequestHandler<EmailList, String> {

    @Override
//    public String handleRequest(Object input, Context context) {
      public String handleRequest(EmailList email, Context context) {
        //context.getLogger().log("Input: " + input);
        //trying this
//        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
//        Session session = sessionFactory.openSession();
        System.out.println(""+email.getFirstName()+""+email.getFirstName2()+""+email.getFirstName3());
        EmailSenderSES emailSender = new EmailSenderSES();
        emailSender.sendEmail();

        // TODO: implement your handler
        return "Hello from Lambda!";
    }

}
