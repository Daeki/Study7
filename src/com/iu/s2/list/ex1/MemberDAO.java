package com.iu.s2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberDAO {
	
	private String info;
	
	public MemberDAO() {
		info ="iu,pw1,32,suji,pw2,27,choa,pw3,30";
	}
	
	
	//memberAdd
	//scanner로 id, pw, age를 입력 받아서 MemberDTO 멤버변수
	//매개변수로 ArrayList를 받아서 생성한 MemberDTO를 추가
	public void memberAdd(ArrayList<MemberDTO> ar) {
		Scanner sc = new Scanner(System.in);
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("Id 입력");
		memberDTO.setId(sc.next());
		
		System.out.println("Pw 입력");
		memberDTO.setPw(sc.next());
		
		System.out.println("Age 입력");
		memberDTO.setAge(sc.nextInt());
		
		ar.add(memberDTO);
	}
	
	
	
	
	//memberInit
	//info에 있는 정보를 파싱해서 MemberDTO 객체생성해서 대입
	//ArrayList에 각각 추가하고 리턴
	public ArrayList<MemberDTO> memberInit() {
		StringTokenizer st = new StringTokenizer(info, ",");
		ArrayList<MemberDTO> ar = new ArrayList<MemberDTO>();
		
		while(st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			String id = st.nextToken();
			memberDTO.setId(id);
			
			String pw = st.nextToken();
			memberDTO.setPw(pw);
			
			String age = st.nextToken();
			int age2 = Integer.parseInt(age);
			memberDTO.setAge(age2);
			
			ar.add(memberDTO);//ArrayList에 추가
		}
		
		return ar;
	}

}
