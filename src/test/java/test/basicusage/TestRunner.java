package test.basicusage;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner
{
   public static void main(String[] args)
   {
	   Result result = JUnitCore.runClasses(MyTestCase.class);
	   
	   for (Failure failure : result.getFailures())
	   {
		   System.out.println("Failed Test -> " + failure.toString());
	   }
	   
	   if(result.wasSuccessful())
	   {
		   System.out.println("The test batch was successfull");
	   }
   }
}  	
