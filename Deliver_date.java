import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Deliver_date {
	public static void main(String [] arg) {
	SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
	Scanner scnr = new Scanner(System.in);
	String firstDate;
	String secondDate;
	System.out.println("Please Enter first date");
	firstDate = scnr.next();
	System.out.println("Please Enter second date");
	secondDate = scnr.next();
	
	try {
	    Date date1 = myFormat.parse(firstDate);
	    Date date2 = myFormat.parse(secondDate);
	    long diff = date2.getTime() - date1.getTime();
	    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} 
	catch (ParseException e) {
	    e.printStackTrace();
		}
}
}

