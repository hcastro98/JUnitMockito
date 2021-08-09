package test.basicusage;

import junitbasics.MessageUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestUnit
{
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage()
   {
      assertEquals(message,messageUtil.printMessage());
   }
   
   @Test
   public void testPrintMessageFalse()
   {
      assertFalse("xyz".equals(messageUtil.printMessage()));
   }
   
   @Test
   public void testAdd()
   {
      //test data
      int num = 5;
      String str = "Junit is working fine";

      //check for equality
      assertEquals("Junit is working fine", str);
      
      //check for false condition
      assertFalse(num > 6);

      //check for not null value
      assertNotNull(str);
   }
}
