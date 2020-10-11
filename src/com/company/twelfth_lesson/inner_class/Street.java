package com.company.twelfth_lesson.inner_class;

import java.util.ArrayList;
import java.util.List;

//Внутренние классы, inner
public class Street
{
	public String name;
	List<Building> buildings = new ArrayList<>();

	public Street(String name, List<Integer> buildingNumbers)
	{
		this.name = name;
		for (Integer number : buildingNumbers)
		{
			Building building = new Building(number);
			buildings.add(building);
		}
	}

	public class Building
	{
		public Integer number;

		public Building(Integer number)
		{
			this.number = number;
			//String name = Street.this.name; // example how to call variables of outer class
		}
	}
}
