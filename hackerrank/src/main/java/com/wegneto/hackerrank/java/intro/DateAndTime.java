package com.wegneto.hackerrank.java.intro;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DateAndTime {

	public static String getDay(String day, String month, String year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Integer.valueOf(year), Integer.valueOf(month)-1, Integer.valueOf(day));

		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE");
		String dayOfWeek = dateFormat.format(calendar.getTime());
		return dayOfWeek.toUpperCase();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		in.close();

		System.out.println(getDay(day, month, year));
	}

}
