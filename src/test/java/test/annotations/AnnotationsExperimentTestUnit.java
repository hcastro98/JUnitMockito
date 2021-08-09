package test.annotations;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationsExperimentTestUnit
{

   //execute before test
   @Before
   public void before()
   {
      System.out.println("in before");
   }
	
   //execute after test
   @After
   public void after()
   {
      System.out.println("in after");
   }
	
   //test case
   @Test
   public void test()
   {
      System.out.println("in test");
   }
	
   //test case ignore and will not execute
   @Ignore
   public void ignoreTest()
   {
      System.out.println("in ignore test");
   }
}