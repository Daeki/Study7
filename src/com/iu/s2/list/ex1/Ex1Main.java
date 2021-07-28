package com.iu.s2.list.ex1;

import java.util.ArrayList;

import com.iu.s2.list.Member;

public class Ex1Main {

	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		ArrayList<MemberDTO> ar = memberDAO.memberInit();
		
		memberDAO.memberAdd(ar);
		
		for(int i=0;i<ar.size();i++) {
			System.out.println("ID : "+ar.get(i).getId());
			System.out.println("PW : "+ar.get(i).getPw());
			System.out.println("Age : "+ar.get(i).getAge());
			System.out.println("--------------------------");
		}

	}

}
