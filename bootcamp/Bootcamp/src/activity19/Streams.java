package activity19;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.lang.Object;

public class Streams {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
//		System.out.println(getNames());
		
//		String[] names = getNames();
//		Stream<String> = hello(getNames());
		System.out.println(hello(getNames()));
//		_hello(getNames());
	}
	
	private static Stream<String> hello(final String...names) {
		Arrays.stream(names)
			.map((String name) -> String.format("Hello, Dr. %s!", name))
			.forEach((String greeting) -> System.out.println(greeting));
		return Arrays.stream(names);
	}
	
	private static void _hello(final String... names) {
		Arrays.stream(names)
			.filter((String name) -> !name.startsWith("A"))
			.forEach((String name) -> System.out.println(
					String.format("Hello, Dr. %s!",  name)));
	}
	
	private static void oneLineHello(final String... names) {
		
	}
	
	private static int getNumber() {
		System.out.print("How many names are there? ");
//		String total = scan.nextLine();
		int total = scan.nextInt();
		
		return total;
	}
	
	private static String[] getNames() {
//		ArrayList<String> names = new ArrayList<>();
		int count = getNumber();
		String[] names = new String[count];
		for(int i = 0; i < count; i++) {
			System.out.print("Enter a name: ");
			String name = scan.next();
//			names.add(name);
			names[i] = name;
		}
		
		return names;
	}
	
	
}
