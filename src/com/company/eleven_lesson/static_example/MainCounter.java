package com.company.eleven_lesson.static_example;

public class MainCounter
{
	public static void main(String[] args)
	{
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();

		counter1.plusOne();
		counter1.plusOne();
		counter2.plusOne();

		System.out.println("Sum1 = " + Counter.number);

		Counter.printNumber();
	}
}
