package com.vtiger.crm.createContact;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContactTest() {
		
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("execute createContactTest");
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest");
	}
}
