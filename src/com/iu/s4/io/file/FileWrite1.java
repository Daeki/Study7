package com.iu.s4.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite1 {
	
	
	public void Write2() {
		//id, pw, age입력
		
		//c-> test -> member.txt
		// id-pw-age
		
		
	}
	
	public void write() {
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\test", "test.txt");
		
		System.out.println("메세지를 입력하세요");
		String message=sc.nextLine();
		
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(message+"\r\n");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
