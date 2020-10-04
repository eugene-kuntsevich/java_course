package com.company.tenth_lesson;

public class Cat implements Noisable, Eatable
{
	public void walk()
	{
		System.out.println("Cat walks...");
	}

	@Override
	public void makeNoise()
	{
		System.out.println("Cat meows...");
	}

	@Override
	public void eat()
	{
		System.out.println("Cat eat...");
	}

	@Override
	public void drink()
	{
		System.out.println("Cat drink...");
	}
}
