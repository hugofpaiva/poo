package Rafa_Cruzeiro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public abstract class Cabine {
	
	private int num;
	private int maxOcupantes;
	String[] passageiros ;
	
	Comparator<String> ordenar= new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
	};
	
	private Set <String> passageirosOrdenados= new TreeSet<String> (ordenar);
	
	public Cabine(int num, int maxOcupantes) {
		super();
		this.num = num;
		this.maxOcupantes = maxOcupantes;
	}


	public Cabine(int num, int maxOcupantes, String[] passageiros) {
		super();
		this.num = num;
		this.maxOcupantes = maxOcupantes;
		passageirosOrdenados.clear();
		for(String p:passageiros){
			passageirosOrdenados.add(p);
		}
	}


	public void setPassageiros(String[] passageiros) {
		if (passageiros.length > maxOcupantes){
			throw new IllegalArgumentException();
		}
		else{
			passageirosOrdenados.clear();;
			for(String p:passageiros){
				passageirosOrdenados.add(p);
				}
			}
	}
	


	public void setMaxOcupantes(int maxOcupantes) {
		this.maxOcupantes = maxOcupantes;
	}
	

	public int getNum() {
		return num;
	}
	
	public int getPassageiros(){
		return passageirosOrdenados.size();
	}


	@Override
	public String toString() {
		String p="[Nº"+num+" ( max "+maxOcupantes+" pessoas ) : "+ passageirosOrdenados +"]";
		if (passageirosOrdenados.size()==0)
			p= "[Nº"+num+" ( max "+maxOcupantes+" pessoas ) : Disponível para Venda!!!]";
		return p;
	}

	
	//UNIVERSAL
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maxOcupantes;
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cabine other = (Cabine) obj;
		if (maxOcupantes != other.maxOcupantes)
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	
	
	
	
	
	

}
