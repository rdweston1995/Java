/*	Constraints
 * 1 <= n <= 100
 * User name consists of any printable characters
 * User name 8 <= length <= 30
 * Contains alphanumeric characters [a-z][A-Z][0-9] and _
 * First character must be [a-z][A-Z]
 */

package challenges;

import java.util.Scanner;

class UsernameRegex{
	String regex = ("^[aA-zZ]\\w{7,29}$");
	
	public static final String regularExpression = null;
}

public class validUsername{
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter how many usernames are going to be tested");
		int n = Integer.parseInt(scan.nextLine());
		while(n-- != 0) {
			String userName = scan.nextLine();
			
			if(userName.matches(UsernameRegex.regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}

