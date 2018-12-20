
public class GovDocs extends Item {

	private boolean classified;
	private boolean redacted;
	private String govParty;

	public GovDocs(String author, int pages, int year, boolean checkedIn, boolean classified, boolean redacted, String govParty) {
		super(author, pages, year, checkedIn);
		this.classified = classified;
		this.redacted = redacted;
		this.govParty = govParty;
	}

	public boolean isClassified() {
		return classified;
	}

	public void setClassified(boolean classified) {
		this.classified = classified;
	}

	public boolean isRedacted() {
		return redacted;
	}

	public void setRedacted(boolean redacted) {
		this.redacted = redacted;
	}

	public String getGovParty() {
		return govParty;
	}

	public void setGovParty(String govParty) {
		this.govParty = govParty;
	}

	@Override
	public void addWeight() {
		// TODO Auto-generated method stub
		
	}

}
