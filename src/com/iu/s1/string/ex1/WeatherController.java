package com.iu.s1.string.ex1;

import java.util.Scanner;

public class WeatherController {
	
	private WeatherInfo weatherInfo;
	private WeatherView weatherView;
	
	public WeatherController() {
		weatherInfo = new WeatherInfo();
		weatherView = new WeatherView();
	}
	
	
	public void start() {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		
		WeatherDTO [] weathers = weatherInfo.makeWeather();
		
		while(check) {
			System.out.println("1. 전체날씨정보출력");
			System.out.println("2. 지역검색정보출력");
			System.out.println("3. 지역 정보  추가");
			System.out.println("4. 프로 그램  종료");
			int select = sc.nextInt();
			
			if(select == 1) {
				this.weatherView.view(weathers);
			}else if(select == 2) {
				System.out.println("2");
			}else if(select==3) {
				System.out.println("3");
			}else {
				break;
			}
		}
		
		
		
		
		
		System.out.println("Finish");
	}

}
