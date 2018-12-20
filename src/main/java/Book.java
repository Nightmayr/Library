
public class Book extends Item {

	private String genre;
	private boolean hasPictures;
	private String publisher;

	public Book(String author, int pages, int year, boolean checkedIn, String genre, boolean hasPictures, String publisher) {
		super(author, pages, year, checkedIn);
		this.genre = genre;
		this.hasPictures = hasPictures;
		this.publisher = publisher;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean isHasPictures() {
		return hasPictures;
	}

	public void setHasPictures(boolean hasPictures) {
		this.hasPictures = hasPictures;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public void addWeight() {
		// TODO Auto-generated method stub
		
	}

}
