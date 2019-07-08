package Aula12_C;

public class TesteComputador extends Teste{
	private String link;
	private int prazo;
	
	public TesteComputador(String disciplina, String professor, String data, String salas) {
		super(disciplina, professor, data, salas);
	}
	
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public int getPrazo() {
		return prazo;
	}
	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	
	
	
	

}
