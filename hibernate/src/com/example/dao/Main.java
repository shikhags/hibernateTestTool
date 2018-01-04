package com.example.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration  cfg=new Configuration();
		//Hibernate is started
		SessionFactory factory=cfg.configure("com/example/dao/hibernate.cfg.xml").buildSessionFactory();
		
			EmployeeDAO.deleteEmployee(factory);
			//EmployeeDAO.updateEmployee(factory);
			//EmployeeDAO.readEmployee(factory);
			//EmployeeDAO.saveEmployee(factory);
		
		//Hibernate is shutdown
		factory.close();
	}

}
