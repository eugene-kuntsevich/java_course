package com.company.seventh_lesson;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapClass
{
	public static void main(String[] args)
	{
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "First");
		map.put(2, "Second");
		map.put(3, "Third");

		for (Map.Entry<Integer, String> entry : map.entrySet())
		{
			System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
		}

		Iterator it = map.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<Integer, String> pair = (Map.Entry<Integer, String>) it.next();
			if (pair.getKey() == 1)
			{
				System.out.println("Value with key 1 was removed");
				it.remove();
			}
		}

		for (Map.Entry<Integer, String> entry : map.entrySet())
		{
			System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
		}
	}
}
