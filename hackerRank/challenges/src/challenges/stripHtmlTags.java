package challenges;

import java.util.*;


public class stripHtmlTags {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int testCases = Integer.parseInt(scan.nextLine());
		while(testCases > 0) {
			String line = scan.nextLine();
			//Works kind of
//			System.out.println(line.replaceAll("<[^>]*>", "").trim());
//			System.out.println(line.substring(0,line.indexOf('>') + 1));
//			int endOfFirstTag = line.indexOf('>') + 1;
//			System.out.println(line.substring(line.length() - endOfFirstTag - 1, line.length()));
			
//			System.out.println(line.split(">"));
//			String beginningTag = line.substring(0, line.indexOf('>') + 1);
//			String endTag = line.substring(line.length() - line.indexOf('>') -1, line.length());
//			String[] arrStr = line.split(beginningTag);
//			String rebuiltStr = arrStr[0];
//			System.out.println(rebuiltStr);
//			arrStr = rebuiltStr.split(endTag);
//			String[] arrStr = line.split(">");
//			System.out.println("test");
//			System.out.println(arrStr.length);
//			for(int i = 0; i < arrStr.length; i++) { 
//				System.out.println(arrStr[i]);
//			}
//			String[] first = line.split(line.substring(0, line.indexOf('>') + 1));
//			for(int i = 0; i < first.length; i++) {
//				System.out.println(first[i]);
//			}
			
			for(int i = 0; i  < line.length(); i++) {
				int tagIndex = line.indexOf('<');
//				System.out.println("First tag index " + tagIndex);
				if(tagIndex != -1) {
					int endTag = line.indexOf('>') + 1;
//					System.out.println("end tag index: " + endTag);
//					line = line.substring(endTag, line.length());
//					line = line.replace(line.substring(tagIndex, endTag), "");
//					System.out.println(line);
					System.out.println("first tag: " + line.substring(tagIndex, endTag));
					String searchEndTag = line.charAt(tagIndex) + "/" + line.substring(tagIndex + 1, endTag);
					System.out.println("Closing Tag: " + searchEndTag);
					System.out.println("Closing Tag Index: " + line.indexOf(searchEndTag));
				}
			}
			
			System.out.println(line);
	
			testCases--;
		}
	}
}
