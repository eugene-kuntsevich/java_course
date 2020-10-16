package com.company.thirteenth_lesson.enums;

public class MainEnum
{
	public static void main(String[] args)
	{
		System.out.println(AutoModels.AUDI);
		System.out.println(AutoModels.AUDI.getColor());
		System.out.println(AutoModels.AUDI.getMaxSpeed());

		AutoModels audi = AutoModels.valueOf("AUDI");
		System.out.println("value of result = " + audi);


	}
}
