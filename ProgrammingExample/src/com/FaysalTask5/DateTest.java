package com.FaysalTask5;

public class DateTest {
	public static void main(String[] args){
		   Date day=new Date();
		   Date month=new Date();
		   Date year=new Date();
		   day.setDay(29);
		   month.setMonth(12);
		   year.setYear(1995);
		   System.out.println( day.getDay()+ "/" +month.getMonth()+ "/" +year.getYear());
		 }
}
