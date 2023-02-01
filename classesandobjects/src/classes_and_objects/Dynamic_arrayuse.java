package classes_and_objects;

public class Dynamic_arrayuse {
public static void main(String args[])
{
	Dynamic_array d = new Dynamic_array();
	
	
	for (int i = 0; i < 10; i++) {
		d.add(10);
	}
	
	System.out.println(d.size());
	
	d.set(4, 10);
	System.out.println(d.get(3));
	System.out.println(d.get(4));
	
	while (!d.isempty()) {
		System.out.println(d.removelast());
		System.out.println("size = " + d.size());
	}
}
}
