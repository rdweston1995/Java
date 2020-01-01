package challenges;

import java.util.*;


public class stripHtmlTags {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int testCases = Integer.parseInt(scan.nextLine());
		while(testCases > 0) {
			String line = scan.nextLine();
			//Works kind of
//			System.out.print(line.replaceAll("<[^/>]*>", ""));
			line = line.replaceAll("<[^/>]*>", "");
			System.out.print(line.replaceAll("<[^>]*>",  "\n"));
	
			testCases--;
		}
	}
}
