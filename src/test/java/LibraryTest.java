import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class LibraryTest {
	
	Book book1;
	Library library;
	GovDocs doc1;
	Maps map1;
	Person umayr;
	
	@Test @Ignore
	public void fail() {
		fail();
	}
	
	@Before
	public void setup() {
		library = new Library();
		book1 = new Book("Umayr Saghir", 100, 1993, true, "Sci-Fi", false, "Penguin");
		umayr = new Person("John Smith", 23, 57657, 0);
//		doc1 = new GovDocs();
//		map1 = new Maps();
		
	}
	
	@Test
	public void addItemTest() {
		library.addItem(book1);
		assertEquals(1, library.libList.size());
	}
	
	@Test
	public void removeItemTest() {
		addItemTest();
		library.removeItem(book1);
		assertEquals(0,library.libList.size());
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
	
	@Test
	public void addPersonTest() {
		library.addPerson(umayr);
		assertEquals(1, library.personRegister.size());
	}
	
	@Test
	public void removePersonTest() {
		addPersonTest();
		library.removePerson(umayr);
		assertEquals(0, library.personRegister.size());
		
	}
	
	@Test
	public void updateItemTest() {
		library.updateItem(book1, "genre", "Henry Chia");
		assertEquals("Henry Chia", book1.getGenre());
	}
	

	@Test
	public void updatePersonTest() {
		library.updatePerson(umayr, "age", "56");
		assertEquals(56, umayr.getAge());
	}
	
	
}
