
public class Figura extends Components{
	private String caption;
	private byte[][] image;
	public Figura(String caption, byte[][] image) {
		super();
		this.caption = caption;
		this.image = image;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public byte[][] getImage() {
		return image;
	}
	public void setImage(byte[][] image) {
		this.image = image;
	}
	
}
