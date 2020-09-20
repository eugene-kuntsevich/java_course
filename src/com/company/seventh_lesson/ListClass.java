package com.company.seventh_lesson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListClass
{
	public static void main(String[] args)
	{
		List<String> strings = new ArrayList<>();
		strings.add("String_1");
		strings.add("String_2");
		strings.add("String_3");
		strings.add("String_4");

		for (String s : strings)
		{
			System.out.println("String = " + s);
		}

		String s = strings.get(0);
		System.out.println("First element is " + s);

		//wrong example
		strings.remove(1);

		for (String s1 : strings)
		{
			System.out.println("String = " + s1);
		}

		int size = strings.size();
		System.out.println("List size = " + size);

		//right example
		Iterator<String> iterator = strings.iterator();
		while (iterator.hasNext())
		{
			String next = iterator.next();
			if ("String_3".equals(next))
			{
				System.out.println("String 'String_3' was removed");
				iterator.remove();
				break;
			}
		}

		for (String s1 : strings)
		{
			System.out.println("String = " + s1);
		}
	}
}
