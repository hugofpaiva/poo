package aula08.Ex2;

public class Cereal extends Alimento implements AlimentoVegetariano {
	
	private String nome;
	
	public Cereal(String nome, double proteinas, double calorias, double peso) {
		super(proteinas, calorias, peso);
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	@Override
	public String toString() {
		return "Cereal " + nome + ", " + super.toString();
	}

}
