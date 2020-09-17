package com.company.fifth_lesson;

public class Return
{
	public static void main(String[] args)
	{
		testMethod();
	}

	private static void testMethod()
	{
		int x = 1;
		if (x > 0)
		{
			System.out.println("Start");
			return;
		}
	}
}
