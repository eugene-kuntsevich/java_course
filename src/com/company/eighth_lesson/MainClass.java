package com.company.eighth_lesson;

import java.util.ArrayList;

public class MainClass
{
	public static void main(String[] args)
	{
		Email email = new Email();// Ctrl + P
		Email email2 = new Email("sender", "recipient", "text", new ArrayList<>());
		Email email3 = new Email("sender", "recipient", "text");
		Email email4 = new Email("sender", "recipient", new ArrayList<>());

		EmailBody emailBody = new EmailBody("text", new ArrayList<>());
		Email2 email21 = new Email2("sender", "recipient", emailBody);

		GetterSetterClass getterSetterClass = new GetterSetterClass();
		getterSetterClass.setNumber(1);
		getterSetterClass.setNumber(3);
	}
}
