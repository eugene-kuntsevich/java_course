package com.company.forth_lesson;

import java.util.ArrayList;
import java.util.List;

public class Cycles
{
	public static void main(String[] args)
	{
		for (int i = 0;i < 9;i = i + 2)
		{
			System.out.println("i = " + i);
		}

		System.out.println("---------------------------------------------");

		List<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		for (Integer integer : integers)
		{
			System.out.println("integer = " + integer);
		}

		System.out.println("---------------------------------------------");

		int j = 3;
		while (j > 0)
		{
			System.out.println(j);
			j--;
		}

		System.out.println("---------------------------------------------");

		int j1 = -1;
		do
		{
			System.out.println(j1);
			j1--;
		}
		while (j1 > -3);

		System.out.println("---------------------------------------------");

		for (int i = 0;i < 10;i++)
		{
			System.out.println("Int i = " + i);
			for (int j2 = 0;j2 < 10;j2++)
			{
				if (j2 == 5) break;
				System.out.println("Int j2 = " + j2);
			}
		}

		System.out.println("---------------------------------------------");

		for (int k = 0;k < 10;k++)
		{
			if (k == 5) continue;
			System.out.println("int k = " + k);
		}
	}
}
