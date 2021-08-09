package junitbasics;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MessageUtilTest
{
    private static MessageUtil msgUtil = null;

    @BeforeClass
    public static void setUp() throws Exception
    {
        msgUtil = new MessageUtil("Hello");
    }

    @AfterClass
    public static void tearDown() throws Exception
    {
    }

    @Test
    public void testGetMessage()
    {
    }

    @Test
    public void testSetMessage() {
    }

    @Test
    public void testPrintMessage()
    {
        assertEquals(msgUtil.printMessage(), "Hello");
    }

    @Test
    public void testSalutationMessage() {
    }
}