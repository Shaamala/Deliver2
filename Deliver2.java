import java.util.Scanner;    // Calling in Scanner to get some user input.
import java.time.LocalDate;  // Importing LocalDate
import java.time.Period;     // Importing Period

public class Deliver2 {
	
	    // Creating a main method.
	    public static void main(String[] arg) {
	      
	        // Prompt for oldest date input by user.
	        System.out.print("Enter the first date in YYYY-MM-DD format: ");

	        // Creating a Scanner object
	        Scanner scanner = new Scanner(System.in);

	        String firstDateS = scanner.nextLine();

	        LocalDate firstDate = LocalDate.parse(firstDateS);

	        System.out.print("Enter the second date in YYYY-MM-DD format: ");

	        String secondDateS = scanner.nextLine();
	        LocalDate secondDate = LocalDate.parse(secondDateS);

	        Period difference = firstDate.until(secondDate);

	        int days = difference.getDays();
	        int months = difference.getMonths();
	        int years = difference.getYears();
	        scanner.close();

	        System.out.println("The date difference is: " + months + " Months, " + days + " Days, and " + years + " Years.");
	    }
	}

