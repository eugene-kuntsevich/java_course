package com.company.sixteenth_lesson.stream_api;

public class Car
{
	private String name;

	private Integer maxSpeed;

	public Car(String name, Integer maxSpeed)
	{
		this.name = name;
		this.maxSpeed = maxSpeed;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getMaxSpeed()
	{
		return maxSpeed;
	}

	public void setMaxSpeed(Integer maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}
}
