package com.inmemory.email;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.inmemory.email.utils.HibernateUtils;
import com.inmemory.email.model.UserToCheck;
import com.inmemory.email.services.EmailService;


public class SendEmailHandler implements RequestHandler<String, String> {

	@Override
	public String handleRequest(String in, Context context) {
		
			SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

			try (Session session = sessionFactory.openSession()) {
				
				
				EmailService email = new EmailService();
				
				email.sendEmail();
				
				
				
				
				
				
//				session.beginTransaction();
//				
//				System.out.println(session.contains(vmUser));
//				session.saveOrUpdate(vmUser);
//				//session.save(vmUser);
//
//				session.getTransaction().commit();

			} catch (Exception e) {
				// TODO: Replace with log4j (don't commit this in prod)
				System.err.println("Something went wrong..." + e);
				e.printStackTrace();
				return String.format("Wasn't able to create new user. Mike's fault");
				
			}

			return String.format("User was successfully created!");
	
	}

	private boolean verifyUser(UserToCheck user) {
		if (user != null) {
			return true;
		}

		return false;
	}
}
