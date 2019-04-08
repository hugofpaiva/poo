package aula08.Ex1;

public class Pesado_P extends Pesado{
	private int MAXPassageiros;

	public Pesado_P(String matricula, String marca, String modelo, int cilindrada, String nQuadro, int peso,
			int mAXPassageiros) {
		super(matricula, marca, modelo, cilindrada, nQuadro, peso);
		MAXPassageiros = mAXPassageiros;
	}

	public int getMAXPassageiros() {
		return MAXPassageiros;
	}

	public void setMAXPassageiros(int mAXPassageiros) {
		MAXPassageiros = mAXPassageiros;
	}

	@Override
	public String toString() {
		return "Pesado_P [MAXPassageiros=" + MAXPassageiros + "]";
	}
	
	

}
