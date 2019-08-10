package activity4;

import java.util.Scanner;
import java.util.HashMap;

public class Activity4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the student's first name. ");
		String firstName = scan.next();
		
		System.out.println("Please enter the student's last name. ");
		String lastName = scan.next();
		
		System.out.println("Please enter the student's middle intial. ");
		String middleInitial = scan.next();
		scan.nextLine();
		
		// ---- CONTACT INFORMATION ----
		System.out.print("Please enter the student's address. ");
		String address = scan.nextLine();
		
		System.out.println("Please enter the student's email. ");
		String email = scan.nextLine();
		
		System.out.println("Please enter the student's phone number. ");
		String phoneNumber = scan.next();
		
		HashMap<String, String> student = new HashMap<>();
		
		student.put("first", firstName);
		student.put("last", lastName);
		student.put("middleInitial", middleInitial);
		student.put("address", address);
		student.put("email", email);
		student.put("phoneNumber", phoneNumber);
		
//		System.out.println(student);
		
		student.forEach((Student, id) ->{
			System.out.println(Student + ": " + id);
		});
		
		System.out.print("Does everything look correct? ");
		String response = scan.next();
	}
}
