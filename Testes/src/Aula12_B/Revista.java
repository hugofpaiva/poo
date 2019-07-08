package Aula12_B;

public class Revista extends Publicacao{
	private String  ISSN;

	public Revista(String titulo, String editora, String iSSN) {
		super(titulo, editora);
		ISSN = iSSN;
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

	public String getISSN() {
		return ISSN;
	}

	public void setISSN(String iSSN) {
		ISSN = iSSN;
	}
	
	

}
