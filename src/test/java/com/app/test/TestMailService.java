package com.app.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import com.app.dev.MailService;

import org.junit.Test;

public class TestMailService {
	
	String toAddr,subject,text;
	
	@Before
	public void setUp() {
		toAddr="dixitshloke7@gmail.com";
		subject="Testing Junit testcase.";
		text="Hi Yogendra, this is your test case mail service.";
	}

	@Test(timeout=50*1000)
	public void test() {

		boolean flag=MailService.sendEmail(toAddr, subject, text);
		assertTrue(flag);
	
	}
	@After
	public void cleanUp() {
		toAddr=subject=text=null;
	}

}
