package test.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({ 
   MessageUtilsTestUnit1.class , MessageUtilTestUnit2.class
})

public class MessageUtilTestSuite {}