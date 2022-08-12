package cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class IteratorTest {

	@Test
	public void test() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer in = itr.next();
			if (in % 3 == 0) {
				itr.remove();
			} else {
				System.out.println(in);
			}
		}
		System.out.println(list);
	}

}
