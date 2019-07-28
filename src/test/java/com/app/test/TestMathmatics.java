package com.app.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.dev.Mathmatics;

public class TestMathmatics {
	
	int num;
	@Before
	public void setUp() {
		num=153;
	}

	@Test
	public void test() {
		boolean flag=Mathmatics.isArmStrong(num);
		assertTrue(flag);
	
	}
	@After
	public void cleanUp() {
		num=0;
	}

}
