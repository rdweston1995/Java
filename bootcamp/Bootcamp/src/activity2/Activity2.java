package activity2;

import java.util.Scanner;

public class Activity2 {
	public static void main(String[] args) {

	    // You need to instantiate something to read user input. Do that here.
	    Scanner scan = new Scanner(System.in);
	    /* Print a message to the screen prompting the user for a student's first
	     *   name. Then, store their response in a String variable.
	     *
	     *   Repeat this for each of the student's attribute: first/last/middle
	     *   name; address; email; and phone number (which you'll store as a
	     *   String).
	     */
	    System.out.println("What is your first name? ");
	    String firstName = scan.nextLine();

	    System.out.println("What is your last name? ");
	    String lastName = scan.nextLine();

	    System.out.println("What is your middle name? ");
	    String middleName = scan.nextLine();

	    System.out.println("What is your email? ");
	    String email = scan.nextLine();

	    System.out.println("What is your phone number? ");
	    String phoneNumber = scan.nextLine();

	    /* Once you've gotten all the information, print the value of each
	     *   variable. Use String.format, and %s to indicate a string
	     *   substitution. */
	    // String output = String.format("Welcome %s %s %s \nEmail: %s \nPhone Number: %s", firstName, lastName, middleName, email, phoneNumber);
	    // System.out.println(output);
	    System.out.println(String.format("Welcome %s %s %s \nEmail: %s \nPhone Number: %s", firstName, lastName, middleName, email, phoneNumber));
	    /* Finally, print a message asking the user if this is correct information.
	     *   Collect their response in a variable called confirmation. Don't do
	     *   anything with it yet, though. */
	     System.out.println("Does everything look correct?");
	     String response = scan.nextLine();

	  }
}
