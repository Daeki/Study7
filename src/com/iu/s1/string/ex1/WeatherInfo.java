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
	
	public WeatherDTO [] makeWeather() {
		//StringBuffer에 있는 Data를 String으로 변환
		info = sb.toString();
		System.out.println(info);
		
		//파싱(parsing, 문자열을 자르는 작업)
		String [] strings = info.split(",");
		System.out.println(strings.length);
		WeatherDTO [] weathers = new WeatherDTO[strings.length/4];
		
		for(int i=0;i<strings.length;i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(strings[i].trim());
			weatherDTO.setGion(strings[++i].trim());
			weatherDTO.setHum(strings[++i].trim());
			weatherDTO.setCondition(strings[++i].trim());
			weathers[i/4]=weatherDTO;
		}
		
		return weathers;
	}

}
