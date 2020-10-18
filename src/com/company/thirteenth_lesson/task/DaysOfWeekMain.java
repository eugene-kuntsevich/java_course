package com.company.thirteenth_lesson.task;

public class DaysOfWeekMain
{
	public static void main(String[] args)
	{
		DaysOfWeek currentDay = DaysOfWeek.THURSDAY;

		int remainingWorkingHours = DaysOfWeek.getRemainingWorkingHours(currentDay);

		System.out.println(remainingWorkingHours + " hours remains!");
	}
}
