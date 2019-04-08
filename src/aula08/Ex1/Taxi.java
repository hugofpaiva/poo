package aula08.Ex1;

public class Taxi extends Automovel_ligeiro{
	private String NLicenca;

	public Taxi(String matricula, String marca, String modelo, int cilindrada, String nQuadro, int cBag,
			String nLicenca) {
		super(matricula, marca, modelo, cilindrada, nQuadro, cBag);
		NLicenca = nLicenca;
	}

	public String getNLicenca() {
		return NLicenca;
	}

	public void setNLicenca(String nLicenca) {
		NLicenca = nLicenca;
	}

	@Override
	public String toString() {
		return "Taxi [NLicenca=" + NLicenca + "]";
	}
	
	

}
