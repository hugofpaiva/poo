package aula06;

public class Data implements Comparable<Data> {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Data: " + dia + "/" + mes + "/" + ano;
	}
	public int compareTo(Data o) {
		if(o.getAno()==ano) {
			if(o.getMes()==mes) {
				if(o.getDia()==dia) {
					return 0;
				}else {
					return dia-o.getDia();
				}
			}else {
				return mes-o.getMes();
			}
		}else {
			return ano-o.getAno();
		}
	}
	
	
	

}
