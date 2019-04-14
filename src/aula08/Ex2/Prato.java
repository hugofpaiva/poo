package aula08.Ex2;

public class Prato extends Conjunto<Alimento> {
	
	private String nome;
	private DiaSemana dia;
	private static int id = 0;
	
	public Prato(String nome, DiaSemana dia) {
		this.nome = nome; 
		Prato.id = id++;
		this.dia = dia;
	}
	
	public Prato(String nome) {
		this.nome = nome;
		Prato.id = id++;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DiaSemana getDiaSem() {
		return dia;
	}

	public void setDiaSem(DiaSemana dia) {
		this.dia = dia;
	}

	public int getNIngredientes() {
		return this.size();
		
	}
	
	public double getCalorias() {
		int calorias = 0;
		Alimento[] alimentos = this.giveElements();
		for(Alimento a : alimentos) {
			calorias += a.getCalorias();
		}
		return calorias;
	}
	
	public double getProteinas() {
		int proteinas = 0;
		Alimento[] alimentos = this.giveElements();
		for(Alimento a : alimentos) {
			proteinas += a.getProteinas();
		}
		return proteinas;
	}
	
	public double getPesoTotal() {
		int pesoTotal = 0;
		Alimento[] alimentos = this.giveElements();
		for(Alimento a : alimentos) {
			pesoTotal += a.getPeso();
		}
		return pesoTotal;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Prato.id = id;
	}
	
	@Override
	public String toString() {
		return "Prato '" + nome + "' composto por "+this.getNIngredientes()+" ingredientes, dia " + dia;
	}
	
	
	
}
