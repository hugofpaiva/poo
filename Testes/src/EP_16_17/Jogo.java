package EP_16_17;

import java.util.Arrays;

public class Jogo {
	private Equipa[] equipas = new Equipa[2];
	private Bola bola;
	private int tempototal, tempodeco;
	public Equipa[] getEquipas() {
		return equipas;
	}
	public void setEquipas(Equipa[] equipas) {
		this.equipas = equipas;
	}
	public Bola getBola() {
		return bola;
	}
	public void setBola(Bola bola) {
		this.bola = bola;
	}
	public int getTempototal() {
		return tempototal;
	}
	public void setTempototal(int tempototal) {
		this.tempototal = tempototal;
	}
	public int getTempodeco() {
		return tempodeco;
	}
	public void setTempodeco(int tempodeco) {
		this.tempodeco = tempodeco;
	}
	public Jogo(Equipa e1, Equipa e2, Bola bola, int tempodeco) {
		this.equipas[0]= e1;
		this.equipas[1]= e2;
		this.bola = bola;
		this.tempodeco = tempodeco;
	}
	@Override
	public String toString() {
		return "Jogo entre " + this.equipas[0].getNome() + " e " + this.equipas[1].getNome();
	}
	

	
}
