package aula08.Ex2;

public class Ementa extends Conjunto<Prato> {
	
	private String nome;
	private String local;
	
	
	public Ementa(String nome, String local) {
		this.nome = nome;
		this.local = local;
	}
	
	public void addPrato(Prato prato, DiaSemana dia) {
		prato.setDiaSem(dia);
		this.addElement(prato);
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "Ementa (Nome: " + nome + ", Local: " + local + ")";
	}


}
