package aula08.Ex1;

public class Automovel_ligeiro extends Veiculo{
	private String NQuadro;
	private int CBag;
	
	public Automovel_ligeiro(String matricula, String marca, String modelo, int cilindrada, String nQuadro, int cBag) {
		super(matricula, marca, modelo, cilindrada);
		NQuadro = nQuadro;
		CBag = cBag;
	}

	public String getNQuadro() {
		return NQuadro;
	}

	public void setNQuadro(String nQuadro) {
		NQuadro = nQuadro;
	}

	public int getCBag() {
		return CBag;
	}

	public void setCBag(int cBag) {
		CBag = cBag;
	}

	@Override
	public String toString() {
		return "Automovel_ligeiro [NQuadro=" + NQuadro + ", CBag=" + CBag + "]";
	}
	
	
	

}
