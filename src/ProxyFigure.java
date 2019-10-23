import java.awt.Color;
import java.awt.Dimension;

import lombok.Value;

@Value
public class ProxyFigure extends Components implements Image{
	private final Dimension dim=null;
	private final String caption;
	private Image img=null;
	public ProxyFigure(String c) {
		caption=c;
	}
	@Override
	public Dimension dimension() {
		// TODO Auto-generated method stub
		return dim;
	}
	@Override
	public Color[][] content() {
		// TODO Auto-generated method stub
		if(img==null) {
			try {
				img = new Figura("Patrat");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return img.content();
	}
	@Override
	public String caption() {
		// TODO Auto-generated method stub
		return caption;
	}
	
}
