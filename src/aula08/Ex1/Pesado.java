package aula08.Ex1;

public class Pesado extends Veiculo{
	private String NQuadro;
	private int peso;
	
	public Pesado(String matricula, String marca, String modelo, int cilindrada, String nQuadro, int peso) {
		super(matricula, marca, modelo, cilindrada);
		NQuadro = nQuadro;
		this.peso = peso;
	}

	public String getNQuadro() {
		return NQuadro;
	}

	public void setNQuadro(String nQuadro) {
		NQuadro = nQuadro;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Pesado [NQuadro=" + NQuadro + ", peso=" + peso + "]";
	}
	
	
	
	

}
