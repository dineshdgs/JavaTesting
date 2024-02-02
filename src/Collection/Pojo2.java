package Collection;

import java.util.ArrayList;
import java.util.List;

public class Pojo2 extends Pojo {
	public static void main(String[] args) {
	List<Pojo2> ii = new ArrayList<Pojo2>();
	Pojo2 e1 = new Pojo2();
	e1.setId(1);
	e1.setName("Dinesh");
	e1.setEmail("dinesh@gmail.com");
	Pojo2 e2 =new Pojo2();
	e2.setId(2);
	e2.setName("vasanth");
	e2.setEmail("vasanth@gmail.com");
	Pojo2 e3 =new Pojo2();
	e3.setId(3);
	e3.setName("sachin");
	e3.setEmail("sachin@gmail.com");
	ii.add(e1);
	ii.add(e2);
	ii.add(e3);
	for (Pojo2 x : ii) {
		System.out.println(x.getId());
		System.out.println(x.getName());
		System.out.println(x.getEmail());
		
		
	}
	}
}
