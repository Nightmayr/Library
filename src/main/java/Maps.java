
public class Maps extends Item {

	private String region;
	private String type; // Satellite
	private int numberRoutes;

	public Maps(String author, int pages, int year, boolean checkedIn, String region, String type, int numberRoutes) {
		super(author, pages, year, checkedIn);
		this.region = region;
		this.type = type;
		this.numberRoutes = numberRoutes;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumberRoutes() {
		return numberRoutes;
	}

	public void setNumberRoutes(int numberRoutes) {
		this.numberRoutes = numberRoutes;
	}

}
