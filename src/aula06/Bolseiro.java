package aula06;

public class Bolseiro extends Aluno {
	double Bolsa;

	public Bolseiro(String nome, int cc, Data dataNasc, Data DataInsc) {
		super(nome, cc, dataNasc, DataInsc);
		
	}

	public Bolseiro(String nome, int cc, Data dataNasc) {
		super(nome, cc, dataNasc);
	}
	public Bolseiro(String nome, int cc, Data dataNasc, Data DataInsc, double Bolsa) {
		super(nome, cc, dataNasc, DataInsc);
		this.Bolsa = Bolsa;
	}

	public Bolseiro(String nome, int cc, Data dataNasc, double Bolsa) {
		super(nome, cc, dataNasc);
		this.Bolsa = Bolsa;
	}

	public double getBolsa() {
		return Bolsa;
	}

	public void setBolsa(double bolsa) {
		Bolsa = bolsa;
	}

	@Override
	public String toString() {
		return super.getNome() + ", Bolsa: " + Bolsa;
	}
	
	
	
	
	

}
