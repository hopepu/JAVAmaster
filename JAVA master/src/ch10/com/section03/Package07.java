package ch10.com.section03;

import java.util.Scanner;

public class Package07 {
	public static void main(String[] args) {
		
		Integer num1 = 100;
		Integer num2 = 200;
		
		System.out.println("num 1 : " + num1);
		System.out.println("num 2 : " + num2);
		
		String value1 = num1.toString();
		
		String value2 = Integer.toString(num1);
		
		System.out.println("num1.toSTring() : " + value1);
		System.out.println("Integer.toString(num2) : " + value2);
		
		
	}
}
