package hope.calendar;

import java.util.Scanner;


public class Calendar {

	private static final int[] MAXDAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxdaysOfMonth(int month) {
		return MAXDAYS[month-1];
		
	}
	
	public static void main(String[] args) {
		System.out.println("calendar");
		Calendar cal = new Calendar();

		
		int month;
		
		System.out.println("input (month):");
		Scanner sc = new Scanner(System.in);
		
		month = sc.nextInt();
		
		System.out.println("month : " + month + ", max days of month : " + cal.getMaxdaysOfMonth(month));
		
		
		sc.close();
	}

}
