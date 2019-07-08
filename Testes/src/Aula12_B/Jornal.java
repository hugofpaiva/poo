package Aula12_B;

public class Jornal extends Publicacao{
	private Ver indicacao;
	private Period Periodicidade;
	
	public Jornal(String titulo, String editora, Ver indicacao) {
		super(titulo, editora);
		this.indicacao = indicacao;
	}
	
	public Jornal(String titulo, Ver indicacao) {
		super(titulo);
		this.indicacao = indicacao;
	}
	
	public Jornal(String titulo) {
		super(titulo);
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
	public Ver getIndicacao() {
		return indicacao;
	}
	public void setIndicacao(Ver indicacao) {
		this.indicacao = indicacao;
	}

	public Period getPeriodicidade() {
		return Periodicidade;
	}

	public void setPeriodicidade(Period periodicidade) {
		Periodicidade = periodicidade;
	}
	
	
	
	
	
	
	

}
