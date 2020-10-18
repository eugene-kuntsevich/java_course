package com.company.fourteenth_lesson.checked_exception;

//Exception
public class SaveInfoTask
{
	public void saveInfoToDatabase(String info) throws CannotSaveInfoException
	{
		if (info.contains(" "))
		{
			throw new CannotSaveInfoException();
		}
		System.out.println("Info saved!");
	}
}
