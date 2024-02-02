package Collection;

import java.util.ArrayList;

public class List {
	private void arrayList() {
		ArrayList<Integer> ex = new ArrayList<Integer>();
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(40);
		ex.add(40);
		ex.add(50);
		ex.add(3, 100);
		System.out.println(ex);
	}
	private void set() {
		ArrayList<Integer> ii = new ArrayList<Integer>();
		ii.add(10);
		ii.add(20);
		ii.add(30);
		ii.add(40);
		ii.add(50);
		ii.add(60);
		ii.set(2, 100);
		System.out.println(ii);
	}
	public static void main(String[] args) {
		List ii = new List();
		ii.arrayList();
		ii.set();
		
	}
}
