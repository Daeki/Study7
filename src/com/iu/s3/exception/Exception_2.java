package com.iu.s3.exception;

public class Exception_2 {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		try {
			test1.t1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("예외 처리 시작");
			//e.printStackTrace();
			
			System.out.println("예외 처리 끝");
		}
//		int [] ar = null;
//		Test2 test2 = new Test2();
//		try {
//			test2.t2(ar);//Null
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
