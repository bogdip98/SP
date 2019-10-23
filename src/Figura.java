import java.awt.Color;
import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import lombok.Value;

@Value
public class Figura extends Components implements Image{
	private final Dimension dim;
	private String caption;
	private final Color[][] content;
	public Figura(String s) throws InterruptedException {
		caption=s;
		content = decode();
		dim = new Dimension(10,10);
	}
	public Color[][] decode() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		return new Color[5][5];
	}
	@Override
	public Dimension dimension() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Color[][] content() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String caption() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
