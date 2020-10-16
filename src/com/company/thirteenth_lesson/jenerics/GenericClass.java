package com.company.thirteenth_lesson.jenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<E>
{
	private List<E> list = new ArrayList<>();

	public GenericClass()
	{
	}

	public void printString(E string)
	{
		System.out.println("Print " + string);
	}
}
