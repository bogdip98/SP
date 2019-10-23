import java.util.ArrayList;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		/*Autor a1 = new Autor("Popescu");
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
		b.setIsbn("isbn");*/
		Components com = new Sectiune("C1");
		com.Add(new Paragraf("Par1"));
		com.Add(new ProxyFigure("Caption"));
		com.print();
		Components com2 = new Sectiune("C2");
		com2.Add(new Paragraf("Par2"));
		com2.Add(new Figura("Fig2"));
		com2.print();
	}
}
