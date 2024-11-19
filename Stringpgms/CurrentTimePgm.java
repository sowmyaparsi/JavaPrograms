package Stringpgms;

import java.util.Date;

public class CurrentTimePgm {

	public static void main(String[] args)
	{
		Date d1=new Date();
		long li=d1.getTime();
		System.out.println(li);
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String d3=d2.toString();
		System.out.println(d3);
		String month=d3.substring(4,7);
		System.out.println(month);
		String year=d3.substring(d3.length()-4);
		System.out.println(year);
		String date=d3.substring(8, 10);
		System.out.println(date);
		String dateformat1=date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(dateformat1);
		}

}
