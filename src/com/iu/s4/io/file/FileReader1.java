package com.iu.s4.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class FileReader1 {

	public static void main(String[] args) {
		File file =new File("c:\\test", "name.txt");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			ArrayList<FileMember> ar = new ArrayList<FileMember>();
			while(true) {
				String str = br.readLine();
				if(str==null) {
					break;
				}
				FileMember fileMember = new FileMember();
				//파싱 작업
				System.out.println(str);
			}
			
			for(int i=0;i<ar.size();i++) {
				System.out.println("id : ");
				System.out.println("Pw : ");
				System.out.println("age : ");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
