package com.company.eighth_lesson;

import java.util.List;

public class EmailBody
{
	private String text;
	private List<String> images;

	public EmailBody(String text, List<String> images)
	{
		this.text = text;
		this.images = images;
	}
}
