package BasicTesting;

public class oddeven {
	public static void main(String[] args) {
		int num[] = {0,1,2,3,4,5,6,7,8,9,10,11,12};
		int min =num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i]<min) {
				min=num[i];
	}
}
		System.out.println("minimum value is "+min);
		
		int max =num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i]>max) {
				max=num[i];
	}
}
		System.out.println("maximum value is "+max);
	}
	}		
		
		
		
		
		