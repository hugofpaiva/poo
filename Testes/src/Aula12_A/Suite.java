package Aula12_A;

public class Suite extends Cabine{
	private int numQuartos;

	

	public Suite(int numero, int capmax) {
		super(numero, capmax);
	}



	public int getNumQuartos() {
		return numQuartos;
	}



	public void setNumQuartos(int numQuartos) {
		this.numQuartos = numQuartos;
	}
	
	public int getMaxOcupantes() {
		return this.getCapmax();
	}



	public void setMaxOcupantes(int maxOcupantes) {
		this.setCapmax(maxOcupantes);
	}
	
	
	
	
	

}
