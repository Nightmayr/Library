import java.util.ArrayList;

public class Library {
	
	ArrayList<Item> libList = new ArrayList<>();
	ArrayList<Person> personRegister = new ArrayList<>();
	
	// Add item to libList
	public void addItem(Item item) {
		libList.add(item);
		
	}
	
	// Remove item from libList
	public void removeItem(Item item) {
		libList.remove(item);
	}
	
	public boolean checkOut(Item item) {
		if(item.isCheckedIn()==true) {
			item.setCheckedIn(false);
			return item.isCheckedIn();			
		} else {
			System.out.println("Item not available to check out");
			return item.isCheckedIn();
		}
	}
	
	// Update Item
	public Item updateItem(Item item, String field, String value) {
		switch(field) {
		case "author":
			item.setAuthor(value);
			return item;
		case "pages":
			item.setPages(Integer.parseInt(value));
			return item;
		case "year":
			item.setYear(Integer.parseInt(value));
			return item;
		case "checkedIn":
			item.setCheckedIn(Boolean.parseBoolean(value));
			return item;
		}
		;
		
	}
	
	
	public boolean checkIn(Item item) {
		if(item.isCheckedIn()==false) {
			item.setCheckedIn(true);
			return item.isCheckedIn();
		} else {
			System.out.println("Item is already checked In");
			return item.isCheckedIn();
		}
		
	}
	
	// Register person methods
	public void addPerson(Person person) {
		personRegister.add(person);
	}
	
	public void removePerson(Person person) {
		personRegister.remove(person);
	}
	
	

}
