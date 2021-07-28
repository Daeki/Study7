package com.iu.s1.wrapper;

public class WwrapperMain3 {

	public static void main(String[] args) {
		String jumin="991224-1234567";
		//9   9   1   2   2   4 - 1  2  3  4  5  6 : 7은검증번호
	//  * 2   3   4   5   6   7   8  9  2  3  4  5
	//    18 + 27 + 4 +  10 + 12 + 28 + 8 + 18 + 6 +  12 + 20+ 30 =122(a)
		
		//2.   122를 11로 나누어서 나머지를 구해기
		//3.   11에서 나머지를 빼기(11-1 = 10) 검증번호랑 같으면 올바른 번호
		//3_1. 11에서 나머지를 뺏을 때 두자리 이상이라면
		//4.   3번에서 나온 결과를 다시 10으로 나누어서 그나머지를 구하기
		//     나머지 숫자랑 체크 번호랑 같으면 올바른 번호
		//1.charAt
		char ch = jumin.charAt(0);//9
		System.out.println(ch+"");
		//int num = Integer.parseInt(ch+"");
		String n1 = String.valueOf(ch);
		int num = Integer.parseInt(n1);
		System.out.println(num*2);
		
		System.out.println("------------------");
		//2. subString
		String n2 = jumin.substring(1,2);
		int num2 = Integer.parseInt(n2);
		System.out.println(num2*3);
		
		System.out.println("-------------------");
		
		//3. split
		String [] nums = jumin.split("");
		int num3 = Integer.parseInt(nums[1]);
		System.out.println(num3*3);
		
		System.out.println("---- Math ----");
		double d = Math.random();
		System.out.println(d);
		
	}

}
