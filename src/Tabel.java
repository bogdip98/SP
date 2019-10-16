
public class Tabel extends Components{
	private String caption;
	private String[] celule;
	public Tabel(String caption, String[] celule) {
		super();
		this.caption = caption;
		this.celule = celule;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String[] getCelule() {
		return celule;
	}
	public void setCelule(String[] celule) {
		this.celule = celule;
	}
	
}
