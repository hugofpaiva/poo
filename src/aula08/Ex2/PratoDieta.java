package aula08.Ex2;

public class PratoDieta extends Prato {
	private double maxCal;
	
	public PratoDieta(String nome, DiaSemana diaSem, double maxCal) {
		super(nome, diaSem);
		this.setMaxCal(maxCal);
	}
	
	public PratoDieta(String nome, double maxCal) {
		super(nome);
		this.setMaxCal(maxCal);
	}

	public double getMaxCal() {
		return maxCal;
	}

	public void setMaxCal(double maxCal) {
		this.maxCal = maxCal;
	}

	@Override
	public String toString() {
		return "Dieta (" + maxCal + " calorias) '" + getNome() + "', composto por " + getNIngredientes() + " ingredientes, dia " + getDiaSem();
	}
	
	

}
