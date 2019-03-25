package aula06;

public class Circulo extends Figura {
	private double raio,d;
	private Ponto centro;
	
	public Circulo(String cor, double raio, Ponto centro) {
		super(cor);
		this.raio = raio;
		this.centro = centro;
		
	}
	
	public double getraio() {
		return raio;
	}
	public Ponto getcentro() {
		return centro;
	}
	public void setraio(double raio) {
		this.raio = raio;
	}
	public void setcentro(Ponto centro) {
		this.centro = centro;
	}
	public String toString(){
		return "Circulo: Raio=" + raio + "; Centro=" + centro;
		
	}
	public double area() {
		return Math.PI*raio*raio;
		
	}
	public double perimetro() {
		return 2*Math.PI*raio;
		
	}
	public boolean inter(Object x) {
		Circulo other = (Circulo) x;
		d = Math.sqrt(Math.pow(centro.getX()-other.centro.getX(), 2)+Math.pow(centro.getY()-other.centro.getY(), 2));
		if(d<(raio+other.getraio())) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		long temp;
		temp = Double.doubleToLongBits(raio);
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
		Circulo other = (Circulo) obj;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
			return false;
		return true;
	}
	
	
	


}
