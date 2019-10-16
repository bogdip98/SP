import java.awt.Font;

public class Paragraf extends Components{
	private String text;
	private Font font;
	public Paragraf(String text, Font font) {
		super();
		this.text = text;
		this.font = font;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Font getFont() {
		return font;
	}
	public void setFont(Font font) {
		this.font = font;
	}
	
}
