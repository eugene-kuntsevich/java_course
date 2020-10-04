package com.company.tenth_lesson;

public class Dog implements Noisable, Eatable
{
	public void run()
	{
		System.out.println("Dog runs...");
	}

	@Override
	public void makeNoise()
	{
		System.out.println("Dog barks...");
	}

	@Override
	public void eat()
	{
		System.out.println("Dog eat...");
	}

	@Override
	public void drink()
	{
		System.out.println("Dog drink...");
	}
}
