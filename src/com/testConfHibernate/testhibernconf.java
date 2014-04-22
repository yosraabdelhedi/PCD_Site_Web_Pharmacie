package com.testConfHibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class testhibernconf {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		SessionFactory sf=cfg.configure().buildSessionFactory();
		
		
	}

}
