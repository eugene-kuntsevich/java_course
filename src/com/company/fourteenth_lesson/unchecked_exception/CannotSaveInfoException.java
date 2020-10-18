package com.company.fourteenth_lesson.unchecked_exception;

public class CannotSaveInfoException extends RuntimeException
{
	public CannotSaveInfoException(String message)
	{
		super(message);
	}

	public CannotSaveInfoException()
	{
	}

	public CannotSaveInfoException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
