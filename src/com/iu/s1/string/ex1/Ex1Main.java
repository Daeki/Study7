package com.iu.s1.string.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		//main은 프로그램실행이나 테스트 역할
		
		//WeatherController wc = new WeatherController();
		//wc.start();
		
		WeatherInfo weatherInfo = new WeatherInfo();
		WeatherDTO [] weatherDTOs = weatherInfo.makeWeather();
		
//		for(int i=0;i<weatherDTOs.length;i++) {
//			System.out.println(weatherDTOs[i].getCity());
//			
//		}

	}

}
