package com.company.twelfth_lesson.nested_class;

//Вложенные классы, nested
public class StaticNestedClassExample
{
	private static int number;

	private void printOuterVariable()
	{
		System.out.println(number);
	}

	public static class Inner
	{
		public String name;

		protected void printOuterVariableInInnerClass()
		{
			int number = StaticNestedClassExample.number;
			System.out.println(number);
		}
	}
}
