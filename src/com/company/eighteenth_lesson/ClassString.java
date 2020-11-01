package com.company.eighteenth_lesson;

public class ClassString
{
	public static void main(String[] args)
	{
		String test = new String("My super string");

		boolean equals = test.equals(test + "1");
		System.out.println(equals);

		int aSuper = test.indexOf(" super");

		System.out.println(aSuper);

		int i = test.lastIndexOf("s");
		System.out.println(i);

		String substring = test.substring(3, 8);
		System.out.println(substring);

		System.out.println("-------------------------");

		String[] s = test.split(" ");
		for (String s1 : s)
		{
			System.out.println(s1);
		}
	}
}
