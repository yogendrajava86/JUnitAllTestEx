package com.app.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestConnectionUtil.class, TestMailService.class, TestMathmatics.class })
public class JUnitAllTests {

}
