package Aula12_B;

import java.util.ArrayList;

public class Livro extends Publicacao{
	private String ISBN;
	private ArrayList<String> autores = new ArrayList<String>();
	public Livro(String titulo, String editora, String iSBN) {
		super(titulo, editora);
		ISBN = iSBN;
	}
	public Livro(String titulo, String editora, String autor, String iSBN) {
		super(titulo, editora);
		ISBN = iSBN;
		this.autores.add(autor);
	}
	public String getTitulo() {
		return super.getTitulo();
	}
	public void setTitulo(String titulo) {
		super.setTitulo(titulo);
	}
	public String getEditora() {
		return super.getEditora();
	}
	public void setEditora(String editora) {
		super.setEditora(editora);
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public ArrayList<String> getAutores() {
		return autores;
	}
	public void setAutores(ArrayList<String> autores) {
		this.autores = autores;
	}

	
}
