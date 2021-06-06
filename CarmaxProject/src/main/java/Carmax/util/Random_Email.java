package Carmax.util;

import java.util.Random;

public class Random_Email {

	public static String getEmail() {
		String Value = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder Build = new StringBuilder();
		Random rnd = new Random();
		while (Build.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * Value.length());
			Build.append(Value.charAt(index));
		}
		String str = Build.toString();
		return str;

	}

	public static void main(String[] args) {

		String email = getEmail();
		System.out.println(email + "@gmail.com");
	}
}
