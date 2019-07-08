package Aula12_D;

import java.util.ArrayList;

public class LojaAlimentar {
	private ArrayList<Object> produtos = new ArrayList<>();
	private String nome, endereco;
	
	public LojaAlimentar(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public void add(Object x) {
		produtos.add(x);		
	}

	@Override
	public String toString() {
		return "LojaAlimentar [produtos=" + produtos + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	
	
	

}
