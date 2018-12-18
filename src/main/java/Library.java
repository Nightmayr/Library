import java.util.ArrayList;

public class Library {
	
	ArrayList<Item> libList = new ArrayList<>();
	
	public void addItem(Item item) {
		libList.add(item);
	}
	
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
	
	
	public int listSize(Item item) {
		return libList.size();
	}
	
	
	
	

}
