package com.company.eighth_lesson;

public class Email2
{
	private String sender;//отправитель
	private String recipient;//получатель
	private EmailBody emailBody; //содержимое письма

	public Email2(String sender, String recipient, EmailBody emailBody)
	{
		this.sender = sender;
		this.recipient = recipient;
		this.emailBody = emailBody;
	}
}
