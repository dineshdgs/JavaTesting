package BasicTesting;

import java.util.Scanner;

import Cross_browser_Testing.PageObject;

public class Amstrong_Number {
	private void Arm() {
		int total,sc,i=0,j=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		sc = input.nextInt();
		total =sc;
		while (total>0) {
			i = total % 10;
			j = j+(i*i*i);
			total =total/10;
		}
		if (sc==j) {
			System.out.println("Armstrong number");
			
		} else {
			System.out.println("Not Armstrong number");
}
}
	private static void count() {
		int c=0;
		for (int i = 0; i < 1000; i++) {
			int a=0,j=0,n;
			
			while (a==j) {
				i = i%10;
				j =j+(i*i*i);
				a=a/10;
			}
			System.out.println("Arms Num is = " + a);
			}
	}
	
	public static void main(String[] args) {
		count();
		
	}

}