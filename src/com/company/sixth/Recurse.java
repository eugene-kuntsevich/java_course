package com.company.sixth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recurse
{
	public static void main(String[] args)
	{
		int i = readNumberFromConsole();
		print(i);
	}

	static void print(int i)
	{
		if (i <= 0)
		{
			System.out.println("Finish!!!");
		}
		else
		{
			System.out.println("Number = " + i);
			i--;
			print(i);
		}
	}

	private static int readNumberFromConsole()
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String inputString = "";
		int number = 0;
		try
		{
			System.out.println("Please, input number and press 'Enter':");
			inputString = reader.readLine();
			number = Integer.parseInt(inputString);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return number;
	}
}
