package com.company.seventh_lesson;

import java.util.HashSet;
import java.util.Set;

public class SetClass
{
	public static void main(String[] args)
	{
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(2);

		for (Integer i : set)
		{
			System.out.println("Int = " + i);
		}
	}
}
