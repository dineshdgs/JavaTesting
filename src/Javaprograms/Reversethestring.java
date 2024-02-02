package Javaprograms;
public class Reversethestring {
	//1.Using forLoop
	private static void usingForLoop() {
		String str = "Automation Testing";
		String rev = "";
		int len = str.length();
		for (int i = len-1; i>=0; i--) {
			rev =rev+str.charAt(i);
		}
System.out.println(rev);
	}
	//2.to array reverse method
	private static void toArray() {
		String str = "Automation Testing";
		String rev ="";
		char a[] = str.toCharArray();
		int len = a.length;
		for (int i = len-1; i >=0; i--) {
			rev =rev +a[i];
		}
		System.out.println(rev); 
	}
	//3.string Buffer
	private static void stringBuffer() {
		String str = "Automation Testing";
		StringBuffer sb = new StringBuffer(str);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		usingForLoop();
		toArray();
		stringBuffer();
	}

}
