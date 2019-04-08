package aula08.Ex1;

public class Pesado_M extends Pesado{
	private int MAXCarga;

	public Pesado_M(String matricula, String marca, String modelo, int cilindrada, String nQuadro, int peso,
			int mAXCarga) {
		super(matricula, marca, modelo, cilindrada, nQuadro, peso);
		MAXCarga = mAXCarga;
	}

	public int getMAXCarga() {
		return MAXCarga;
	}

	public void setMAXCarga(int mAXCarga) {
		MAXCarga = mAXCarga;
	}

	@Override
	public String toString() {
		return "Pesado_M [MAXCarga=" + MAXCarga + "]";
	}
	
	

}
