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
	
//	public boolean updateItem(Item item) {
//		
//	}
	
	public boolean checkIn(Item item) {
		if(item.isCheckedIn()==false) {
			item.setCheckedIn(true);
			return item.isCheckedIn();
		} else {
			System.out.println("Item is already checked In");
			return item.isCheckedIn();
		}
		
	}
	
	
	public void addPerson(Person person) {
		personRegister.add(person);
	}
	
	public void removePerson(Person person) {
		personRegister.remove(person);
	}
	
	
//	public int listSize(String choice) {
//		if(choice.equals(libList))
//			return list.size();
//	}
//	
//	
	
	

}
