package Aula12_D;

import java.util.TreeMap;

public class Alimento {
	private String nome, validade;
	private double preco, calorias;
	private static TreeMap<String, Integer> validades = new TreeMap<>();
	
	public Alimento(String nome, double preco, double calorias, String validade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.calorias = calorias;
		this.validade = validade;
		if(validades.keySet().contains(validade)) {
			int x = validades.get(validade);
			x++;
			validades.put(validade, x);
		}else {
			validades.put(validade, 1);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	
	
	
	
	
	
	

}
