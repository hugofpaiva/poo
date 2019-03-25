package aula06;

public class Figura {
	String cor;

	public Figura(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Figura [cor=" + cor + "]";
	}
	

}
