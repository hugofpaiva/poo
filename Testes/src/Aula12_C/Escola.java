package Aula12_C;

import java.util.ArrayList;

public class Escola {
	private String nome, endereco;
	private ArrayList<Teste> testes = new ArrayList<Teste>();
	
	public Escola(String nome, String endereco) {
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


	
	public void add(Object o) {
		this.testes.add((Teste)o);
		
	}
	
	public String Printer1() {
		return String.format("%-25s%-30s%-20s%-15s\n", "Disciplina","Professor Responsável","data/hora","salas");
	}
	
	public String Printer() {
		String returno = "";
		returno+= this.Printer1(); 
		for(Teste i : this.testes) {
			returno+=i.Printer();
		}
		return returno;
	}

	@Override
	public String toString() {
		return "A Escola com o " + nome + " e endereco " + endereco + ", tem estes testes:\n" + this.Printer();
	}
	
	
	
	


}
