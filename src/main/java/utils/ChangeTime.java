package utils;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ChangeTime
{
	public String dateTime_ = "";
	String rDT = "";
	
	public ChangeTime(String dateTime)
	{
		this.dateTime_ = dateTime;
		dateTime_ = changedateTime();
		System.out.println("dateTime_   "+dateTime_);
	}

	public String changedateTime()
	{
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy'T'HH:mm:ss'Z'", Locale.US);
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));        
		//Date dt = sdf.parse("2013-09-29T18:46:19Z");
		Date dt = sdf.parse(dateTime_);
		
		rDT = dt.toString();
		System.out.println(rDT);
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		return rDT;
	}
	
	/*
	 * public static void main(String args[]) { ChangeTime ct = new ChangeTime();
	 * ct.changedateTime("31-01-2019T19:0:0Z"); }
	 */
}
