package org.molgenis.codecov;

public class Hello
{
	public String hello(String who)
	{
		if (who == null)
		{
			return null;
		}
		return "Hello " + who;
	}

	public void newMethod()
	{
		System.out.println("lalala");
	}
}
