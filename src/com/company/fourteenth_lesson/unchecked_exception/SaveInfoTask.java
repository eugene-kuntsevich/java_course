package com.company.fourteenth_lesson.unchecked_exception;

public class SaveInfoTask
{
	public void saveInfoToDatabase(String info)
	{
		if (info.contains(" "))
		{
			throw new CannotSaveInfoException("Exception message");
		}
		System.out.println("Info saved!");
	}
}
