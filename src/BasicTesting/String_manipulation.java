package BasicTesting;

import java.util.Scanner;

public class String_manipulation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = sc.next();
		//String s = "wElcome1 @ Dinesh@005";
		int small = 0;
		int caps = 0;
		int special =0;
		int num =0;
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		sb.append(sb);
		System.out.println(sb.isEmpty());
		System.out.println(sb.compareTo(sb));
		System.out.println("append is = " + sb);
		System.out.println("Reverse = " + sb);
		for (int i = 0; i < s.length(); i++) {
			if ('a'<= s.charAt(i)&& s.charAt(i)<='z') {
				small++;
			}
			else if ('A' <=s.charAt(i)&& s.charAt(i)<='Z') {
				caps++;
			}
			else if ('0' <=s.charAt(i)&& s.charAt(i)<='9') {
				num++;
		}
			else {
				special++;
		}
		}
		System.out.println("count of small = "  +  small);
		System.out.println("count of caps = "  +  caps);
		System.out.println("count of num = "  +  num);
		System.out.println("count of special = "  +  special);
	
		

}
}