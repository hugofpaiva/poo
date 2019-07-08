package Aula12_B;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
	private String nome, endereco;
	private ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();

	public Biblioteca(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Publicacao> getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}

	public void add(Publicacao x1) {
		this.publicacoes.add(x1);
	}

	public int getSize() {
		return publicacoes.size();
	}

	public String printPub(ArrayList<Publicacao> x) {
		String pub="";
		for (Publicacao p : x) {
			pub+=p.toString();
		}
		return pub;
	}
	
	public String printOrd() {
		Collections.sort(publicacoes);
		return this.toString()+ printPub(this.getPublicacoes());
	}

	@Override
	public String toString() {
		return "A Biblioteca " + nome + " com o endereco " + endereco + " e " + this.getSize()+ "publicações, das quais constam:\n" + this.printPub(this.getPublicacoes());
	}

}
