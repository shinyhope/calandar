package hope.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int a, b;
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		
		s1 = sc.next();
		s2 = sc.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		
		System.out.printf("%d + %d = %d",  a, b, a + b);
		sc.close();
	}

}
