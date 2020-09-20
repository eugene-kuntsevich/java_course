package com.company.seventh_lesson;

public class Arrays
{
	public static void main(String[] args)
	{
		int[] array = new int[]{99, 867, 456};

		for(int i : array)
		{
			System.out.println("int = " + i);
		}
		
		String[] arrString = new String[3];
		arrString[0] = "string_1";
		arrString[1] = "string_2";
		arrString[2] = "string_3";

		for (String s : arrString)
		{
			System.out.println("String = " + s);
		}

		arrString[2] = null;

		for (String s : arrString)
		{
			System.out.println("String = " + s);
		}

		//runtime
	}
}
