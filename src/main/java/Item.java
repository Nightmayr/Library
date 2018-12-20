
public abstract class Item {

	private String author;
	private int pages;
	private int year;
	private boolean checkedIn;
	private static int count = 0;
	private int id;
	
	public Item(String author, int pages, int year, boolean checkedIn) {
		this.author = author;
		this.pages = pages;
		this.year = year;
		this.checkedIn = checkedIn;
		this.id = count++;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
