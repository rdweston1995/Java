package challenges;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaStringToken {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
//		if(s.length() == 0) {
//			System.out.println(s.length());
//		}else {
//			output(s);
//		}
		output(s);
		scan.close();
	}
	
	public static void output(String s) {
		s = s.trim();
		System.out.println("'" + s + "'");
		System.out.println("'" + s.substring(0, s.length()) + "'");
		if(s.isEmpty()) {
			System.out.println(0);
		}else {
			String delims = "[\\s .,?!'_@]+";
			String[] tokens = s.split(delims);
			System.out.println(tokens.length);
			for(int i = 0; i < tokens.length; i++) {
				System.out.println(tokens[i]);
			}
		}
			
	}
}
