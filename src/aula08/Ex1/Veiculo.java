package aula08.Ex1;

public class Veiculo implements KmPercorridosInterface{
	private String matricula, marca, modelo;
	private int cilindrada, trajeto, totaltrajeto=0;
	
	
	public Veiculo(String matricula, String marca, String modelo, int cilindrada) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	@Override
	public String toString() {
		return "veiculos [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada="
				+ cilindrada + "]";
	}
	@Override
	public void trajeto(int quilometros) {
		trajeto = quilometros;
		totaltrajeto += quilometros;
		
		
	}
	@Override
	public int ultimoTrajeto() {
		return trajeto;
	}
	@Override
	public int distanciaTotal() {
		return totaltrajeto;
	}
	
	
	
	

}
