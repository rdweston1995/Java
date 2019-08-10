package activity6;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Activity6 {
	
	public static HashMap<String, String> studentInfo() {
		Scanner input = new Scanner(System.in);
		HashMap<String, String> student = new HashMap<>();
		
		System.out.print("Please enter the student's first name. ");
		if(input.hasNext()) student.put("first", input.next());
		
		System.out.print("Pleaes enter the student's last name. ");
		if(input.hasNext()) student.put("last", input.next());
		
		System.out.print("Please enter the student's middle name. ");
		if(input.hasNext()) student.put("middle", input.next());
		
		//Break so that address just doesn't roll into the email prompt
		input.nextLine();
		
		System.out.print("Please enter the student's address. ");
		if(input.hasNextLine()) student.put("address", input.nextLine());
		
		System.out.print("Please enter the student's email. ");
		if(input.hasNext()) student.put("email", input.next());
		
		System.out.print("Please enter the student's phone number. ");
		if(input.hasNext()) student.put("phone number", input.next());
		
		
		return student;
	}
	
	static String confirmation(String message, Scanner input) {
		System.out.println(message);
		return input.next();
	}
	
	static void printList(ArrayList<HashMap<String, String>> students) {
		System.out.println("======PRINT LIST======");
		for(HashMap<String, String> _student: students) {
			_student.forEach((attr, value) ->{
				System.out.println(String.format("The student's %s is %s.", attr, value));
				
			});
			System.out.println("----------------------------");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<HashMap<String, String>> students = new ArrayList<>();
		boolean iterate = true;
		while(iterate) {
			HashMap<String, String> student = new HashMap<>();
		
			student = studentInfo();
//			System.out.println(student);
			String response = confirmation("Does this look correct? (Yes/No)", input).toLowerCase();
			System.out.println(response);
			if(response.equals("yes")) {
				students.add(student);
				printList(students);
			} else {
				System.out.println("Please re-enter the students information");
				student = studentInfo();
				students.add(student);
			}
			
			response = confirmation("Do you want to add more students? (Yes/No)", input).toLowerCase();
			if(response.equals("yes")) {
				iterate = true;
			} else {
				iterate = false;
			}
//			iterate = false;
		}
		
		System.out.println("Loop Exited");
		
//		String response = confirmation("Does this look correct", input);
//		System.out.println(response);
		
	}
}
