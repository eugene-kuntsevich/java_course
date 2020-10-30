package com.company.seventeenth_lesson.threads;

public class MainThreadClass
{
	public static void main(String[] args)
	{
		System.out.println("Main thread started...");
		for (int i = 1;i < 5;i++)
		{
			new MyThread("My thread " + i).start();
		}
		System.out.println("Main thread finished...");
	}
}
