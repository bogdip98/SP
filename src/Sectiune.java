import java.util.List;
import java.util.Vector;

public class Sectiune extends Components{
	private String titlu;
	List<Sectiune> child = new Vector<Sectiune>();
	public Sectiune(String titlu) {
		super();
		this.titlu = titlu;
	}
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	
}
