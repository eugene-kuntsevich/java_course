package com.company.thirteenth_lesson.task;

public class DaysOfWeekMain
{
	public static void main(String[] args)
	{
		DaysOfWeek currentDay = DaysOfWeek.TUESDAY;

		int remainingWorkingHours = 0;
		try
		{
			remainingWorkingHours = DaysOfWeek.getRemainingWorkingHours(currentDay);
		}
		catch (DayNotFoundException e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println(remainingWorkingHours + " hours remains!");

		System.out.println("--------------------------------------------------");
		//пример с эксепшеном
		DaysOfWeek sunday = DaysOfWeek.SUNDAY;

		int remainingWorkingHours2 = 0;
		try
		{
			remainingWorkingHours2 = DaysOfWeek.getRemainingWorkingHours(sunday);
		}
		catch (DayNotFoundException e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println(remainingWorkingHours2 + " hours remains!");
	}
}
