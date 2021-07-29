package com.iu.s2.list.ex1;

public class MemberView {
	
	
	//view
	public void view() {
		//myPage 선택시 실행
		//id, pw, age 출력 => MemberDTO 
		//단, 메서드의 head는 변경 X
		//멤버변수 선언 X
		MemberDTO memberDTO = MemberSession.SESSION.get("member");
		System.out.println("ID : "+memberDTO.getId());
		System.out.println("PW : "+memberDTO.getPw());
		System.out.println("Age : "+memberDTO.getAge());
		System.out.println(MemberSession.SESSION.get("member").getId());
		
	}

}
