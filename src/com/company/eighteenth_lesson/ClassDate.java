package com.company.eighteenth_lesson;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClassDate
{
	public static void main(String[] args)
	{
		Date date = new Date(); //+ используется для пересылки и хранения даты
		Instant instant = date.toInstant();

		Calendar calendar = Calendar.getInstance(); //используется для операций с датой, но я им не пользовался
		Date time = calendar.getTime();
		GregorianCalendar gregorianCalendar = new GregorianCalendar();

		LocalDate localDate = LocalDate.now(); // + используется для оперций с ДАТАМИ (не точнее дня)
		LocalDateTime localDateTime = LocalDateTime.now(); // + используется для операций с датами с точностью до милисекунды

		// 01.01.1970

		//------------------------------------------------------------------------------------------------------------------------

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");// используется для конвертирования даты из
		// милисекунд в читабельную даты согласно шаблона
		LocalDate localDate1 = LocalDate.now();
		String newDate = localDate1.format(formatter);
		System.out.println(newDate);
		LocalDate localDate2 = localDate1.plusDays(5);
		String newDate2 = localDate2.format(formatter);
		System.out.println(newDate2);

		long timeInMilliseconds = 999999111111L;
		LocalDateTime parseMilliseconds = Instant.ofEpochMilli(timeInMilliseconds).atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println(parseMilliseconds);

		Date newDate10 = new Date();
		LocalDateTime localDateTime1 = Instant.ofEpochMilli(newDate10.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
		LocalDateTime localDateTime2 = localDateTime1.plusHours(48);
		Date from = Date.from(localDateTime2.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(from);
	}
}
