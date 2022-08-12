package cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class ListIteratorTest {

	@Test
	public void test() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);

		ListIterator<Integer> lt = list.listIterator();

		// forward direction
		while (lt.hasNext()) {
			System.out.println(lt.next());
		}

		// backword direction
		while (lt.hasPrevious()) {
			System.out.println(lt.previous());
		}

	}

}
