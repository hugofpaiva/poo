package Rafa_Cruzeiro;

public class Suite extends Cabine{
	
	private int numQuartos;

	public Suite(int num, int maxOcupantes) {
		super(num, maxOcupantes);
	}

	public Suite(int num, int maxOcupantes, int numQuartos) {
		super(num, maxOcupantes);
		this.numQuartos=numQuartos;
	}
	
	public Suite(int num, int maxOcupantes, String[] passageiros) {
		super(num, maxOcupantes, passageiros);
		
	}

	public void setNumQuartos(int numQuartos) {
		this.numQuartos = numQuartos;
	}
	
	

	public int getNumQuartos() {
		return numQuartos;
	}

	@Override
	public String toString() {
		return "Suite c/"+numQuartos+" quartos "+super.toString();
	}
	
	//UNIVERSAl

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numQuartos;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Suite other = (Suite) obj;
		if (numQuartos != other.numQuartos)
			return false;
		return true;
	}
	
	
	
	

	
	
	

}
