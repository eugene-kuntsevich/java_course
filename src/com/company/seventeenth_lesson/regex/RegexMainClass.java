package com.company.seventeenth_lesson.regex;

import java.util.regex.Pattern;

public class RegexMainClass
{
	public static void main(String[] args)
	{
		//https://www.javatpoint.com/java-regex
		boolean result1 = Pattern.matches(".s", "as"); //true (2nd char is s)
		System.out.println(result1);

		/*Create a regular expression that accepts 10 digit numeric characters starting with 7, 8 or 9 only.*/
		boolean result2 = Pattern.matches("[789]{1}[0-9]{9}", "9953038949");
		System.out.println(result2);//true
	}
}
