package ch10.com.section03;

import java.util.StringTokenizer;

public class Package10 {
	public static void main(String[] args) {
		
		StringTokenizer str = new StringTokenizer("Welcome to Java Programing");
		
		System.out.println("str.nextElement():");
		while(str.hasMoreElements()) {
			System.out.println(str.nextElement());
		}
	


	}
}
