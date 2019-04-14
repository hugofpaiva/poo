package aula08.Ex2;

public class Carne extends Alimento {
	
	private VariedadeCarne variedade;
	
	public Carne(VariedadeCarne variedade, double proteinas, double calorias, double peso) {
		super(proteinas, calorias, peso);
		this.variedade = variedade;
	}
	
	

	public VariedadeCarne getVariedade() {
		return variedade;
	}



	public void setVariedade(VariedadeCarne variedade) {
		this.variedade = variedade;
	}



	@Override
	public String toString() {
		return "Carne " + variedade + ", " + super.toString();
	}
	
	
	
	

}
