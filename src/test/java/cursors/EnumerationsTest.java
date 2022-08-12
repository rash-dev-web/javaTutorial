package cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationsTest {

	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(1);
		vec.add(2);
		vec.add(3);
		
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements()) {
			Integer in = e.nextElement();
			System.out.println(in);
		}
	}
}
