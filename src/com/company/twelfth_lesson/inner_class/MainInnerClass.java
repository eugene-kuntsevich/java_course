package com.company.twelfth_lesson.inner_class;

import java.util.ArrayList;
import java.util.List;

public class MainInnerClass
{
	public static void main(String[] args)
	{
		List<Integer> buildingNumbers = new ArrayList<>();
		buildingNumbers.add(20);
		buildingNumbers.add(30);
		Street street = new Street("Oginskogo", buildingNumbers);

		System.out.println("Street name = " + street.name);

		for (Street.Building building : street.buildings)
		{
			System.out.println("Buildings number = " + building.number);
		}
	}
}
