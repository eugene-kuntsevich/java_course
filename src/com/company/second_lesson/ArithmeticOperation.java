package com.company.second_lesson;

public class ArithmeticOperation
{
	public static void main(String[] args)
	{
		int i = 1;
		String s = "string";
		System.out.println(i + s);

		long aLong2 = 922337203685477580L;
		i = (int) aLong2;

		//остаток от деления
		System.out.println("-----------------------------------------------");
		int a = 33;
		int b = 5;
		int c = a % b;
		System.out.println(c);

		System.out.println("-----------------------------------------------");
		int a1 = 8;
		System.out.println(a1++);
		System.out.println(a1++);
		System.out.println(a1);

		System.out.println("-----------------------------------------------");
		int a2 = 8;
		System.out.println(++a2);
		System.out.println(++a2);

		//повторить тоже самое для --


	}
}
