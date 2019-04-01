package aula07;

public class Bola extends Obj_Movel{
	private String cor;

	public Bola(double x, double y, double vmax, double distperc, String cor) {
		super(x, y, vmax, distperc);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	

}
