package com.iu.s1.math;

public class MathMain1 {

	public static void main(String[] args) {
		//0 - 9 이하(10 미만)의 랜덤한 정수를 출력
		
		double d = Math.random()*10;
		//d=d*10;
		int result = (int)d;
		
		System.out.println(d);
		System.out.println(result);

	}

}
