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
		switch(field.toLowerCase()) {
		case "author":
			item.setAuthor(value);
			break;
		case "pages":
			item.setPages(Integer.parseInt(value));
			break;
		case "year":
			item.setYear(Integer.parseInt(value));
			break;
		case "checkedin":
			item.setCheckedIn(Boolean.parseBoolean(value));
			break;
		case "genre":
			if (item instanceof Book) {
				((Book)item).setGenre(value);
			}
			break;
		case "classified":
			if(item instanceof GovDocs) {
				((GovDocs)item).setClassified(Boolean.parseBoolean(value));
			}
			break;
		case "region":
			if(item instanceof Maps) {
				((Maps)item).setRegion(value);
			}
		};
		return item;
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
	
	public Person updatePerson(Person person, String field, String value) {
		switch(field.toLowerCase()) {
		case "name":
			person.setName(value);
			break;
		case "age":
			person.setAge(Integer.parseInt(value));
			break;
		case "id":
			person.setId(Integer.parseInt(value));
			break;
		case "numitems":
			person.setNumItems(Integer.parseInt(value));
			break;
		}
		return person;
	}
	

}
