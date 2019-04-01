package aula07;

import java.util.ArrayList;

public class Equipa {
	private String nome,rsp;
	int golosm, goloss;//Golos marcados é soma dos golos marcados por todos os robos, os sofridos é a soma da outra equipa
	ArrayList<Robo> jogadores = new ArrayList<Robo>();
	public Equipa(String nome, String rsp, int golosm, int goloss) {
		this.nome = nome;
		this.rsp = rsp;
		this.golosm = golosm;
		this.goloss = goloss;
	}
	public void add(Robo obj) {
		jogadores.add(obj);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRsp() {
		return rsp;
	}
	public void setRsp(String rsp) {
		this.rsp = rsp;
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
	public ArrayList<Robo> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Robo> jogadores) {
		this.jogadores = jogadores;
	}
	
	
	
	
	

}
