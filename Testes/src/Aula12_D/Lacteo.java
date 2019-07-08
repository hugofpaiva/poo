package Aula12_D;

public class Lacteo extends Alimento{
	private int tempMin, tempMax;
	private double gordura;

	public Lacteo(String nome, double preco, double calorias, String validade) {
		super(nome, preco, calorias, validade);
		this.tempMin = 3;
		this.tempMax = 5;
	}

	public Lacteo(String nome, double preco, int calorias, String validade, double gordura) {
		super(nome, preco, calorias, validade);
		this.tempMin = 3;
		this.tempMax = 5;
		this.gordura = gordura;
	}

	public double getGordura() {
		return gordura;
	}

	public void setGordura(double gordura) {
		this.gordura = gordura;
	}

	public int getTempMin() {
		return tempMin;
	}

	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}

	public int getTempMax() {
		return tempMax;
	}

	public void setTempMax(int tempMax) {
		this.tempMax = tempMax;
	}

	public void setTemp(int tempMin, int tempMax) {
		this.tempMin = tempMin;
		this.tempMax = tempMax;
		
	}
	
	
	
	


	
	

}
