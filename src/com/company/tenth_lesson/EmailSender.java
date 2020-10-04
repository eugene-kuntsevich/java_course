package com.company.tenth_lesson;

public interface EmailSender
{
	/**
	 * Метод предназначен для периодической рассылки электронных писем
	 * @param period периодичность рассылки (в часах)
	 */
	void sendEmail(int period);
}
