package Aula12_B;

public class Publicacao implements Comparable{
	private String titulo, editora;

	public Publicacao(String titulo, String editora) {
		this.titulo = titulo;
		this.editora = editora;
	}
	
	public Publicacao(String titulo) {
		this.titulo = titulo;
		editora = "ND";
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "\"" + titulo + "\" da editora " + editora + "\n";
	}

	@Override
	public int compareTo(Object o) {
		String comparetitulo = ((Publicacao) o).getTitulo();
		return this.getTitulo().compareTo(comparetitulo);
	}


	
	

}
