package com.company.fourteenth_lesson.unchecked_exception;

//Runtime exception
public class UncheckedExceptionMainClass
{
	public static void main(String[] args)
	{
		String info = "strin g";
		//String info = "string";

		SaveInfoTask saveInfoTask = new SaveInfoTask();

//		if (!info.contains(" "))
//		{
			saveInfoTask.saveInfoToDatabase(info);
//		}
	}
}
