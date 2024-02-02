package BasicTesting;

public class Factorial_Fibonacci {
	
	public static void factorial() {
		int count =1;
		for (int i = 0; i <=5; i++) {
			count=count*i;
		}
		System.out.println("Factorial for 1 to 10 =" +count);

	}
	
	public static void fibonacii() {
		int a=0,b=1,c;
		System.out.println("fibonacii series");
		System.out.println(a+ ", ");
		System.out.println(b+ ", ");
		for (int i = 0; i < 10; i++) {
			c=a+b;
			System.out.println(c + ", ");
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		//factorial();
		fibonacii();
	}

}
