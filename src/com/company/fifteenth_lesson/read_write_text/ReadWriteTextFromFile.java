package com.company.fifteenth_lesson.read_write_text;

import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFromFile
{
	public static void main(String[] args) throws IOException
	{
		FileWriter writer = new FileWriter("D:/123.txt", false);
		try
		{
			// запись всей строки
			String text = "Hello Gold!";
			writer.write(text);
			// запись по символам
			writer.append('\n');

			writer.flush();
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
