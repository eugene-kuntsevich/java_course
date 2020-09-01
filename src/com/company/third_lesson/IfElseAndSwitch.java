package com.company.third_lesson;

public class IfElseAndSwitch
{
	public static void main(String[] args)
	{
		int i = 3;

		if (i > 10)
		{
			System.out.println("i > 10");
		}
		else if (i > 1)
		{
			System.out.println("i > 1");
		}
		else
		{
			System.out.println("another case");
		}

		System.out.println("-----------------------------------------------");

		String s = "test";
		switch (s)
		{
			case "test1":
				System.out.println("--1--");
			case "test2":
				System.out.println("--2--");
			case "test":
				System.out.println("--3--");
		}

		System.out.println("-----------------------------------------------");

		// тернарный оператор
		int x = 3;
		int y = 2;

		int z = x < y ? ( x + y ) : ( x - y );
		System.out.println(z);

		int z2 = 0;
		if (x < y)
		{
			z2 = x + y;
		}
		else
		{
			z2 = x - y;
		}
		System.out.println(z2);
	}
}
