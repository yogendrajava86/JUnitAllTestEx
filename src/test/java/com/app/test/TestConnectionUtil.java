package com.app.test;

import java.sql.Connection;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import com.app.dev.ConnectionUtil;

public class TestConnectionUtil {
	
	Connection con1,con2;
	@Before
	public void setUp() {
		con1=ConnectionUtil.getSingletonConnection();
		con2=ConnectionUtil.getSingletonConnection();
	}

	@Test
	public void test() {		
		assertNotNull(con1);
		assertNotNull(con2);
		assertSame("Not a signleton connection",con1,con2);
		
	}
	
	@After
	public void cleanUp() {
		con1=con2=null;
	}

}
