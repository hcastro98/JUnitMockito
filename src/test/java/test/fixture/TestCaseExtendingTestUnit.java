package test.fixture;

import junit.framework.TestCase;

public class TestCaseExtendingTestUnit extends TestCase
{
	protected int value1, value2;

	//assigning the values
	protected void setUp()
	{
		value1 = 3;
		value2 = 3;
	}
	
	//test method to add two values
	public void testAdd()
	{
		double result = value1 + value2;
		assertTrue(result == 6);
	}
	
	public void testblabla()
	{
		double result = value1 + value2;
		assertTrue(result == 6);
	}
}