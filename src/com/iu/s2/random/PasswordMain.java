package com.iu.s2.random;

public class PasswordMain {

	public static void main(String[] args) {
		Password p = new Password();
		String password = p.makePassword();
		System.out.println(password);

	}

}
