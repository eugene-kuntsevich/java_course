package com.company.forth_lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadStringFromConsole
{
	public static void main(String[] args)
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String inputString = "";

		try
		{
			System.out.println("Please, input string and press 'Enter':");
			inputString = reader.readLine();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("You inputted string: " + inputString);
	}
}
