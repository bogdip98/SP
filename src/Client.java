import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		Autor a1 = new Autor("Popescu");
		Autor a2 = new Autor("Ionescu");
		Book book = new Book();
		ArrayList<Autor> autori = new ArrayList<Autor>();
		autori.add(a1);
		autori.add(a2);
		book.setAutor(autori);
		book.addAutor(a1);
		book.addAutor(a2);
		book.removeAutor(a1);
		Sectiune s = book.createSection("Titlu");
		Sectiune s2 = book.createSection(s,"Title");
		Book b = new Book();
		b.setTitle("Titlu");
		b.setIsbn("isbn");
	}
}
