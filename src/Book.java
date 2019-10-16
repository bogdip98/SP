import java.util.ArrayList;
import java.util.Collection;

public class Book {
	private String title;
	private String isbn;
	public Collection<Autor> autori = new ArrayList<Autor>();
	public Collection<Sectiune> sect = new ArrayList<Sectiune>();
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setAutor(ArrayList<Autor> autori) {
		this.autori.addAll(autori);
	}
	public void addAutor(Autor a1) {
		this.autori.add(a1);
	}
	public void removeAutor(Autor a1) {
		this.autori.remove(a1);
	}
	public Sectiune createSection(String title) {
		Sectiune s = new Sectiune(title);
		sect.add(s);
		return s;
	}
	public Sectiune createSection(Sectiune s, String title) {
		sect.add(s);
		return s;
	}
}
