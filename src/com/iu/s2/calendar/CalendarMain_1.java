package com.iu.s2.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain_1 {

	public static void main(String[] args) {
		
		//현재 날짜와 시간의 정보
		Calendar ca = Calendar.getInstance();//new GregorianCalendar();
		System.out.println(ca);//toString()
		
		int year = ca.get(Calendar.YEAR);
		System.out.println("Year : "+year);
		int month = ca.get(Calendar.MONTH)+1;
		System.out.println("Month : "+month);
		int date = ca.get(Calendar.DATE);
		System.out.println("Date : "+date);
		
		//시 분 초
		int hour = ca.get(Calendar.HOUR_OF_DAY);
		System.out.println("hour : "+hour);
		int minute = ca.get(Calendar.MINUTE);
		
		int second = ca.get(Calendar.SECOND);

		Date d = ca.getTime();
		System.out.println(d);
		
	}

}
