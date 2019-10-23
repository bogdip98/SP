import java.awt.Color;
import java.awt.Dimension;

public interface Image {
	public Dimension dimension();
	public Color[][] content();
	public String caption();
	default void print() { System.out.println("Figura " + content());}
}
