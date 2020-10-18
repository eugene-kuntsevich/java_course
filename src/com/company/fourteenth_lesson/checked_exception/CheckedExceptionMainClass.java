package com.company.fourteenth_lesson.checked_exception;

public class CheckedExceptionMainClass
{
	public static void main(String[] args)
	{
		String info = "stri ng";
//		String info = "string";

		SaveInfoTask saveInfoTask = new SaveInfoTask();

		try
		{
			saveInfoTask.saveInfoToDatabase(info);
		}
		catch (CannotSaveInfoException e)
		{
			System.out.println("Exception caught!");
		}
		catch (Exception e)
		{
			System.out.println("Exception caught!");
		}
		finally
		{
			System.out.println("I'm executing anyway");
		}
	}
}
