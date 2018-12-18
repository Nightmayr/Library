import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class LibraryTest {
	
	Book book1;
	Library library;
	GovDocs doc1;
	Maps map1;
	Person person;
	
	@Test @Ignore
	public void fail() {
		fail();
	}
	
	@Before
	public void setup() {
		library = new Library();
		book1 = new Book("Umayr Saghir", 100, 1993, true, "Sci-Fi", false, "Penguin");
		person = new Person("John Smith", 23, 57657, 0);
//		doc1 = new GovDocs();
//		map1 = new Maps();
		
	}
	
	@Test
	public void addItemTest() {
		library.addItem(book1);
		assertEquals(1, library.listSize(book1));
	}
	
	@Test
	public void removeItemTest() {
		addItemTest();
		library.removeItem(book1);
		assertEquals(0,library.listSize(book1));
	}
	
	@Test
	public void checkOutTestIfTrue() {
		 boolean input = library.checkOut(book1);
//		 assertFalse(input);
		 assertEquals(false, input);
	}
	
	@Test
	public void checkOutTestIfFalse() {
		book1.setCheckedIn(false);
		 boolean input = library.checkOut(book1);
//		 assertFalse(input);
		 assertEquals(false, input);
	}
	
	@Test
	public void checkInTestIfFalse() {
		book1.setCheckedIn(false);
		boolean input = library.checkIn(book1);
//		assertTrue(input);
		assertEquals(true, input);
	}
	
	@Test
	public void checkInTestIfTrue() {
		boolean input = library.checkIn(book1);
		assertEquals(true, input);
	}
	

	
	
	
}
