package com.company.eighth_lesson;

import java.util.List;

/**
 * FSN +
 * FormBasedSearch +
 * ProjAssetView +
 * ProdView -
 * ClassView -
 */
public class Email
{
	private String sender;//отправитель
	private String recipient;//получатель
	private String text;
	private List<String> images;

	//constructor
	public Email()
	{

	}

	//constructor
	public Email(String sender, String recipient, String text)
	{
		this.sender = sender;
		this.recipient = recipient;
		this.text = text;
	}

	public Email(String sender, String recipient, List<String> images)
	{
		this.sender = sender;
		this.recipient = recipient;
		this.images = images;
	}

	//auto generation Alt + Insert
	public Email(String sender, String recipient, String text, List<String> images)
	{
		this.sender = sender;
		this.recipient = recipient;
		this.text = text;
		this.images = images;
	}
}
