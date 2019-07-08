package Aula12_D;

public class Cereal extends Alimento{
	private TIPO_CEREAL comp;

	public Cereal(String nome, double preco, double calorias, String validade) {
		super(nome, preco, calorias, validade);
	}
	
	

	public TIPO_CEREAL getComp() {
		return comp;
	}

	public void setComp(TIPO_CEREAL comp) {
		this.comp = comp;
	}
	
	
	
	
	
	
	
	
	
	

}
