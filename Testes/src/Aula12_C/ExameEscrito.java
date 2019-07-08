package Aula12_C;

public class ExameEscrito extends Teste{
	private int versao;
	private Boolean consulta;
	private int Prazo;
	
	

	public ExameEscrito(String disciplina, String professor, String data, String salas, int versao) {
		super(disciplina, professor, data, salas);
		this.versao = versao;
	}
	
	public ExameEscrito(String disciplina, String professor, String data, String salas) {
		super(disciplina, professor, data, salas);
	}
	

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	public Boolean getConsulta() {
		return consulta;
	}

	public void setConsulta(Boolean consulta) {
		this.consulta = consulta;
	}

	public int getPrazo() {
		return Prazo;
	}

	public void setPrazo(int prazo) {
		Prazo = prazo;
	}
	
	
	
	
	
	
	
	

}
