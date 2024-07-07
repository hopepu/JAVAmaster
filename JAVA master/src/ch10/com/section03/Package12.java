package ch10.com.section03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Package12 {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
		String fulldata = dateF.format(date);
		System.out.println("현재날짜 : " + fulldata);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
		String day = dateFormat.format(date);
		System.out.println("일 : " + day);
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM");
		String day2 = dateFormat2.format(date);
		System.out.println("월 : " + day2);
		
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy");
		String day3 = dateFormat3.format(date);
		System.out.println("년 : " + day3);


	}
}
