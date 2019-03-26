package Teste;

public class Livro {
	private String title; 
	private int pubYear; 
	private String isbn;
	
	public Livro(String title, int pubYear, String isbn) {
		super();
		this.title = title;
		this.pubYear = pubYear;
		this.isbn = isbn;
	}
	
	

	public Livro(String title) {
		super();
		this.title = title;
	}



	@Override
	public String toString() {
		return "Livro [title=" + title + ", pubYear=" + pubYear + ", isbn=" + isbn + "]";
	}
	
	
	
	

}
