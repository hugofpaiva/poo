package aula07;

public class Bola extends Obj_Movel{
	private String cor;

	public Bola(double x, double y, double vmax, String cor) {
		super(x, y, vmax);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	

}
