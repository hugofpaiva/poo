package Aula12_A;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Cruzeiro implements Comparable<Cruzeiro>{
	private String nome, datacomeco;
	private int duracao;
	private String[] cidades;
	
	Comparator<Cabine> ordenar= new Comparator<Cabine>() {
		@Override
		public int compare(Cabine o1, Cabine o2) {
			return(o1.getNumero()>o2.getNumero() ? 1:-1);
		}
	};
	
	private Set <Cabine> cabines = new TreeSet <>(ordenar);
	
	
	public int compareTo(Cruzeiro st){  
		if(duracao==st.duracao)  
		return 0;  
		else if(duracao>st.duracao)  
		return 1;  
		else  
		return -1;  
		}  
		  
	
	

	
	public Set<Cabine> getCabines() {
		return cabines;
	}

	public void setCabines(Set<Cabine> cabines) {
		this.cabines = cabines;
	}

	public Cruzeiro(String nome, String[] cidades, String datacomeco) {
		this.nome = nome;
		this.cidades = cidades;
		this.datacomeco = datacomeco;

	}
	
	public void add(Cabine c){
		cabines.add(c);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDatacomeco() {
		return datacomeco;
	}

	public void setDatacomeco(String datacomeco) {
		this.datacomeco = datacomeco;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		StringBuilder print = new StringBuilder();
		print.append("Navio " + nome + ", partida em " + datacomeco +"\n");
		print.append("Itenerário: "+Arrays.toString(cidades)+"\n");
		for(Cabine c: cabines)
			print.append(c.toString()+"\n");	
		return print.toString();
	}
	
	
	
	


	

}
