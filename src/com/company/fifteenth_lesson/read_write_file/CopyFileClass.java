package com.company.fifteenth_lesson.read_write_file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFileClass
{
	public static void main(String[] args) throws IOException
	{
		File source = new File("D:/86ae0b2400c92d333751c8d9a9ae68e4.png");
		File destination = new File("D:/test/86ae0b2400c92d333751c8d9a9ae68e4.png");
		Files.copy(source.toPath(), destination.toPath());
	}
}
