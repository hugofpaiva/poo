package EP_16_17;

import java.util.HashSet;
import java.util.Set;

public class Equipa {
	private String nome, responsavel;
	private int golosm, goloss;
	private Set<Robo> conjunto = new HashSet<>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public int getGolosm() {
		return golosm;
	}
	public void setGolosm(int golosm) {
		this.golosm = golosm;
	}
	public int getGoloss() {
		return goloss;
	}
	public void setGoloss(int goloss) {
		this.goloss = goloss;
	}
	public Set<Robo> getConjunto() {
		return conjunto;
	}
	public int getGolosMarcados() {
		for(Robo i: conjunto) {
			golosm+=i.getGolos();
		}
		return golosm;
	}
	public Robo[] getRobos() {
		int x = conjunto.size();
		int y=0;
		Robo[] c = new Robo[x];
		for(Robo l: conjunto) {
			c[y]=l;
			y++;
			
			
		}
		return c;
		
	}
	
	public void setConjunto(Set<Robo> conjunto) {
		this.conjunto = conjunto;
	}
	public Equipa(String nome, String responsavel) {
		this.nome = nome;
		this.responsavel = responsavel;
		
	}
	
	public void add(Robo x) {
		this.conjunto.add(x);
	}
	
	public void remove(Robo x) {
		this.conjunto.remove(x);
	}
	
	public String getStringRobos() {
		String x = "robos= ";
		for(Robo i : conjunto) {
			x+="id="+i.getId()+", tipo="+ i.getTipo()+"*;* ";
			
		}
		return x;
	}
	public String getStringRobos1() {
		String x = "\trobos=";
		for(Robo i : conjunto) {
			x+="\tid="+i.getId()+", tipo="+ i.getPosicao()+" *;* \n\t"+"golosMarcados="+i.getGolos()+"\n";
			
		}
		return x;
	}
	
	public String mostras() {
		return "{"+ this.getNome()+"="+ this.getNome()+", treinado por "+this.getResponsavel()+" ("+ this.conjunto+"jogadores)\n"+this.getStringRobos1();
	}
	
	@Override
	public String toString() {
		return "Equipa " + nome + ", treinada por " + responsavel + " ("+ this.getRobos().length + " jogadores)\n" + "robos= " + this.getStringRobos() + "\n" + "golosMarcados=" + this.getGolosMarcados() + "\n";
	}
	
	

}
