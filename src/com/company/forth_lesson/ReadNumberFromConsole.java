package com.company.forth_lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumberFromConsole
{
	public static void main(String[] args)
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
		System.out.println("You inputted number: " + number);
	}
}
