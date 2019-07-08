package Rafa_Cruzeiro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Cruzeiro {

	private String nome,data;
	private int duracaoDias;
	private String[] itenerario;
	
	Comparator<Cabine> ordenar= new Comparator<Cabine>() {
		@Override
		public int compare(Cabine o1, Cabine o2) {
			return(o1.getNum()>o2.getNum() ? 1:-1);
		}
	};
	
	private Set <Cabine> cabines= new TreeSet <>(ordenar);
	
	public String pprint() {
		String x ="";
		for(Cabine i: this.cabines) {
			x+= i.getNum()+"\n";
		}
		return x;
	}
	
	
	public Cruzeiro(String nome,  String[] itenerario,String data) {
		this.nome = nome;
		this.data = data;
		this.itenerario = itenerario;
	}
	
	public void setDuracao(int duracaoDias) {
		this.duracaoDias = duracaoDias;
	}
	
	public void add(Cabine c){
		cabines.add(c);
	}


	public Set<Cabine> getCabines() {
		return cabines;
	}

	public void setOrdenar(Comparator<Cabine> ordenar) {
		this.ordenar = ordenar;
	}

	@Override
	public String toString() {
		StringBuilder print = new StringBuilder();
		print.append("Navio " + nome + ", partida em " + data +"\n");
		print.append("Itenerário: "+Arrays.toString(itenerario)+"\n");
		for(Cabine c: cabines)
			print.append(c.toString()+"\n");	
		return print.toString();
	}
	
	
	
	
	
	
	
}
