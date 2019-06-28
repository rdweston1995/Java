package challenges;

import java.util.Scanner;
import java.util.ArrayList;

public class JavaArraylist {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
//		ArrayList<Integer[]> table = new ArrayList<Integer[]>();
//		table.add(new Integer[rows]);
//		
//		while(rows >= 0) {
//			int rowLength = scan.nextInt();
//			//int[] row = new int[rowLength];
//			ArrayList<Integer[]> row = new ArrayList<Integer[]>(); 
//			for(int i = 0; i < rowLength; i++) {
//				row.add(scan.nextInt());
//			}
//			
//			//table.add(rows, row);
//
//			
//			
//			
//			rows--;
//		}
		
		int[][] table = new int[rows][];
		
		int iterator = 0;
		
		while(iterator != rows) {
			int rowLength = scan.nextInt();
			for(int i = 0; i < rowLength; i++) {
				table[iterator][i].add(scan.nextInt());
			}
			
			iterator++;
		}
	}
}
