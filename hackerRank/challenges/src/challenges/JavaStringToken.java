package challenges;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaStringToken {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
//		System.out.println(output(s));
		output(s);
		//output1(s);
		scan.close();
	}
	
	public static void output(String s) {
		//Need to remove the starting spaces and start the string at the first letter
//		String str = s;
//		int index = 1;
//		while(str.indexOf(" ") == 0) {
//			str = str.substring(index, str.length());
//			System.out.println(str);
//			index++;
//		}
		if(s.length() == 0) {
			System.out.println(s.length());
		}else {
			s = s.trim();
			String delims = "[\\s .,?!'_@]+";
			String[] tokens = s.split(delims);
			System.out.println(tokens.length);
			for(int i = 0; i < tokens.length; i++) {
				System.out.println(tokens[i]);
			}
		}
		
	}
	
	public static void output1(String s) {
		String newS = s.replaceAll("\\s","");
		System.out.println(newS);
		
		String newnewS = newS.replaceAll("\\,","");
		System.out.println(newnewS);
		
	}
}
