package aula05;

public class Retangulo {
	private double comprimento, altura;
	
	public Retangulo(double comprimento, double altura) {
		this.comprimento = comprimento;
		this.altura = altura;
	}
	public double getcomprimento() {
		return comprimento;
	}
	public double getaltura() {
		return altura;
	}
	public void setcomprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public void setaltura(double altura) {
		this.altura = altura;
	}
	public String toString(){
		return "Retângulo: Comprimento=" + comprimento + "; Altura=" + altura;
		
	}
	public double area() {
		return comprimento*altura;
	}
	public double perimetro() {
		return comprimento*2+altura*2;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(comprimento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Retangulo other = (Retangulo) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (Double.doubleToLongBits(comprimento) != Double.doubleToLongBits(other.comprimento))
			return false;
		return true;
	}
	
}
