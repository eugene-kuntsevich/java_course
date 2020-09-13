package com.company.fifth_lesson;

public class Methods
{
	private static String s = "";

	static int helloWithParameter(int i1, int i2)
	{
		int i = i1 + i2;
		return i;
	}

	public static void main(String[] args)
	{
		int result = helloWithParameter(1, 2);
		System.out.println("result = " + result);

		int i = helloWithAnyCountOfParameter(4, 5, 6, 7, 8, 9, 6);
		System.out.println("result2 = " + i);
	}

	void hello()
	{
		System.out.println("print");
	}

	String helloWithReturn()
	{
		if (2 > 1)
		{
			return "result1";
		}
		else if (0 < 1)
		{
			return "result2";
		}
		return null;
	}

	static int helloWithAnyCountOfParameter(int ...nums)
	{
		int result = 0;
		for (int x : nums)
			result += x;
		return result;
	}

	// boolean = true, false
	// Boolean = true, false, null
	// int = 0;
	// Integer = null
}
