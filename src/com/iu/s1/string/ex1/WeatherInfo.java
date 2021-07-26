package com.iu.s1.string.ex1;

public class WeatherInfo {
	
	private String info;
	private StringBuffer sb;
	
	public WeatherInfo() {
		sb = new StringBuffer();
		sb.append("seoul, 37, 80, 맑음,");
		sb.append("daegu, 43, 90 , 지옥,");
		sb.append("busan, -32 , 10 , 눈,");
		sb.append("jeju, 3, 40 , 비");
	}
	
	public void makeWeather() {
		System.out.println(sb);
	}

}
