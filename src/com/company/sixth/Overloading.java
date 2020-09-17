package com.company.sixth;

public class Overloading
{
	public static void main(String[] args)
	{
		printNumber(2, 3);
		printNumber(2, 3, 4);
	}

	private static void printNumber(int i1, int i2)
	{
		printNumber(i1, i2, 0);
	}
	private static void printNumber(int i1, int i2, int i3)
	{
		printNumber(i1, i2, i3, 0);
	}

	private static void printNumber(int i1, int i2, int i3, int i4)
	{
		int i = i1 + i2 + i3 + i4;
		System.out.println("Sum numbers: " + i);
	}
}
