package aula06;

public class Triangulo extends Figura {
	private double lado1,lado2,lado3,s;
	
	public Triangulo(String cor, double lado1,double lado2,double lado3) {
		super(cor);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double getlado1() {
		return lado1;
	}
	public double getlado2() {
		return lado2;
	}
	public double getlado3() {
		return lado3;
	}
	public void setlado1(double lado1) {
		this.lado1 = lado1;
	}
	public void setlado2(double lado2) {
		this.lado2 = lado2;
	}
	public void setlado3(double lado3) {
		this.lado3 = lado3;
	}
	/*public double[] getLados(){
	 double[] lados = new double[3];
	 lados[0]=lado1;
	 lados[1]=lado2;
	 lados[3]=lado3;
	 return lados;
	 }
	 */
	public String toString(){
		return "Triangulo: Lado 1=" + lado1 + "; Lado 2=" + lado2 + "; Lado 3=" + lado3;
		
	}
	public double perimetro() {
		return lado1+lado2+lado3;
	}
	public double area(double perimetroT1) {
		s=perimetroT1/2;
		return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(lado1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lado2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lado3);
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
		Triangulo other = (Triangulo) obj;
		if (Double.doubleToLongBits(lado1) != Double.doubleToLongBits(other.lado1))
			return false;
		if (Double.doubleToLongBits(lado2) != Double.doubleToLongBits(other.lado2))
			return false;
		if (Double.doubleToLongBits(lado3) != Double.doubleToLongBits(other.lado3))
			return false;
		return true;
	}
	

}
