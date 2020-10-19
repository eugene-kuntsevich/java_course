package com.company.thirteenth_lesson.task;

public enum DaysOfWeek
{
	MONDAY(1, 8), TUESDAY(2, 5), WEDNESDAY(3, 6), THURSDAY(4, 7), FRIDAY(5, 3), SATURDAY(6, 1), SUNDAY(7, 0);

	int dayNumber;
	int workingHours;

	DaysOfWeek(int dayNumber, int workingHours)
	{
		this.dayNumber = dayNumber;
		this.workingHours = workingHours;
	}

	public static int getRemainingWorkingHours(DaysOfWeek daysOfWeek) throws DayNotFoundException
	{
		switch (daysOfWeek)
		{
			case MONDAY:
				return MONDAY.workingHours + getRemainingWorkingHours(TUESDAY);
			case TUESDAY:
				return TUESDAY.workingHours + getRemainingWorkingHours(WEDNESDAY);
			case WEDNESDAY:
				return WEDNESDAY.workingHours + getRemainingWorkingHours(THURSDAY);
			case THURSDAY:
				return THURSDAY.workingHours + getRemainingWorkingHours(FRIDAY);
			case FRIDAY:
				return FRIDAY.workingHours + getRemainingWorkingHours(SATURDAY);
			case SATURDAY:
				return SATURDAY.workingHours;
			/* удалил SUNDAY из списка
			case SUNDAY:
				return SUNDAY.workingHours;*/
		}
		throw new DayNotFoundException(String.format("Day with name %s was not find", daysOfWeek.name()));
	}
}
