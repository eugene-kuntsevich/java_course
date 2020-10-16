package com.company.thirteenth_lesson.jenerics;

import java.util.ArrayList;
import java.util.List;

public class JenericClass
{
	private static List<String> list = new ArrayList<>();

	public static void main(String[] args)
	{
		list.add("string");
		System.out.println(list);

		GenericClass<String> genericClass = new GenericClass<>();
		genericClass.printString("our string");
	}
}
