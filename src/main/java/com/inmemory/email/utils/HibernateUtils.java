package com.inmemory.email.utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.inmemory.email.model.UserToCheck;

public class HibernateUtils {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (null != sessionFactory) {
			return sessionFactory;
		}

		Configuration configuration = new Configuration();

		String jdbcUrl = "jdbc:mysql://" + System.getenv("RDS_HOSTNAME") + "/" + System.getenv("RDS_DB_NAME");

		configuration.setProperty("hibernate.connection.url", jdbcUrl);
		configuration.setProperty("hibernate.connection.username", System.getenv("RDS_USERNAME"));
		configuration.setProperty("hibernate.connection.password", System.getenv("RDS_PASSWORD"));
		configuration.addAnnotatedClass(UserToCheck.class);
		//configuration.configure();

		final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		try {
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		} catch (HibernateException ex) {
			// TODO: Replace with log4j (don't commit this in prod)
			System.err.println("Initial SessionFactory creation failed." + ex);
			StandardServiceRegistryBuilder.destroy(serviceRegistry);

			throw new ExceptionInInitializerError(ex);
		}

		return sessionFactory;
	}

}
