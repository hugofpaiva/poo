public class Bebida {
	private String nome;
	private double teorAlc;
	
	
	public Bebida(String nome, double teorAlc) {
		super();
		this.nome = nome;
		this.teorAlc = teorAlc;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getTeorAlc() {
		return teorAlc;
	}


	public void setTeorAlc(double teorAlc) {
		this.teorAlc = teorAlc;
	}


	@Override
	public String toString() {
		return "Bebida [nome=" + nome + ", teorAlc=" + teorAlc + "]";
	}
	
	
	
	
}
