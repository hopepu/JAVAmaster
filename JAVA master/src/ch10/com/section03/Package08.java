package ch10.com.section03;

import java.sql.Date;

public class Package08 {
	public static void main(String[] args) {
		
		Date this_date = new Date(2022,12,24);
		Date given_date = new Date(2020,12,24);
		
		boolean status1 = this_date.after(given_date);
		boolean status2 = this_date.before(given_date);
		
		System.out.println(this_date +"는 " + given_date + "이후일이다. : " + status1);
		System.out.println(this_date +"는 " + given_date + "이전일이다. : " + status2);
		
	}
}
