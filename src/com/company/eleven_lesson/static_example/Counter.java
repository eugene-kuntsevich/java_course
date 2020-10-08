package com.company.eleven_lesson.static_example;

public class Counter
{
	static int number = 0;
	int numberNonStatic = 0;

	public void plusOne()
	{
		System.out.println("Plus one");
		number++;
	}

	public static void printNumber()
	{
		System.out.println("Sum2 = " + number);
	}
}
