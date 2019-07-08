package Aula12_A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Cabine {
	private int numero, capmax;
	private String[] passageiros;

	Comparator<String> ordenar = new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
	};

	private Set<String> passageirosOrdenados = new TreeSet<String>(ordenar);

	
	public Set<String> getPassageirosOrdenados() {
		return passageirosOrdenados;
	}

	public void setPassageirosOrdenados(Set<String> passageirosOrdenados) {
		this.passageirosOrdenados = passageirosOrdenados;
	}

	public Cabine(int numero, int capmax, String[] ocupantes) {
		this.numero = numero;
		this.capmax = capmax;
		this.passageiros = ocupantes;
		passageirosOrdenados.clear();
		for(String p:ocupantes){
			passageirosOrdenados.add(p);
		}
	}

	public Cabine(int numero, int capmax) {
		this.numero = numero;
		this.capmax = capmax;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapmax() {
		return capmax;
	}

	public void setCapmax(int capmax) {
		this.capmax = capmax;
	}

	public int getPassageiros() {
		return passageirosOrdenados.size();
	}

	public void setPassageiros(String[] ocupantes) {
		if (ocupantes.length > this.capmax) {
			throw new IllegalArgumentException();
		} else {
			this.passageiros = ocupantes;
			passageirosOrdenados.clear();
			for(String p:ocupantes){
				passageirosOrdenados.add(p);
				}
			}
		}
	

	@Override
	public String toString() {
		String p = "[Nº" + numero + " ( max " + capmax + " pessoas ) : " + passageirosOrdenados + "]";
		if (passageirosOrdenados.size() == 0)
			p = "[Nº" + numero + " ( max " + capmax + " pessoas ) : Disponível para Venda!!!]";
		return p;
	}

}
