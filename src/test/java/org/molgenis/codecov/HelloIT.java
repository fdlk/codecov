package org.molgenis.codecov;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HelloIT
{
	private Hello hello;

	@org.testng.annotations.BeforeMethod
	public void setUp() throws Exception
	{
		hello = new Hello();
	}

	@Test
	public void testHello(){
		assertEquals(hello.hello("Me"), "Hello Me");
	}

}