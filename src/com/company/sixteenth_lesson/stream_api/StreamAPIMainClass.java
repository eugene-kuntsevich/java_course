package com.company.sixteenth_lesson.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIMainClass
{
	public static void main(String[] args)
	{
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("RENO", 150));
		cars.add(new Car("MERS", 170));
		cars.add(new Car("LADA", 190));

		List<Car> filteredCars = cars.stream().filter(car -> car.getMaxSpeed() > 160).collect(Collectors.toList());

		filteredCars.forEach(car -> System.out.println(car.getName()));
		System.out.println("------------------------------------------------");

		//List<String> carNames = cars.stream().map(car -> car.getName()).collect(Collectors.toList());
		List<String> carNames = cars.stream().map(Car::getName).collect(Collectors.toList());

		carNames.forEach(System.out::println);
	}
}
