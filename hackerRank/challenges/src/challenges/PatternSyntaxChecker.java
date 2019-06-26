//Sample input
//3
//([A-Z])(.+)
//[AZ[a-z](a-z)
//batcatpat(nat

//Expected Output
//Valid
//Invalid
//Invalid

package challenges;

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases > 0) {
			String pattern = in.nextLine();
			//System.out.println(pattern);
			try {
//				if(Pattern.compile(pattern)) {
//					System.out.println("Valid");	
//				}
				//System.out.println(Pattern.compile(pattern));
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch(PatternSyntaxException exception) {
				System.out.println("Invalid");
				//System.exit(1);
			}
			//System.out.println("Valid");
			testCases--;
		}
	}
}
