package com.company.thirteenth_lesson.enums;

public enum AutoModels
{
	LADA("blue", 100), AUDI("red", 120), OPEL("green", 150);

	private String color;
	private int maxSpeed;

	AutoModels(String color, int maxSpeed)
	{
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public int getMaxSpeed()
	{
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}
}

//энумерейшен, перечисления
