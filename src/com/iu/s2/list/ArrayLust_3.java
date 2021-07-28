package com.iu.s2.list;

import java.util.ArrayList;

public class ArrayLust_3 {

	public static void main(String[] args) {
		
		//Member 타입을 모을려고 하는 리스트 선언
		ArrayList<Member> ar = new ArrayList<Member>();
		Member member = new Member();
		member.setId("iu");
		member.setPw("pw");
		ar.add(member);
		
		ar.add(new Member());//1
		ar.get(1).setId("id");//Member
		
		Member member2 = ar.get(0);
		

	}

}
