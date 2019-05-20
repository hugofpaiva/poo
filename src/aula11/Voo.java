package aula11;

public class Voo {
	private String Hora, Voo, Origem, Atraso;

	public Voo(String hora, String voo, String origem, String atraso) {
		this.Hora = hora;
		this.Voo = voo;
		this.Origem = origem;
		this.Atraso = atraso;
	}
	
	public String getCompanhia() {
		String Companhia="";
		for(int x=0; x<=1; x++) {
			Companhia.concat(this.Voo.valueOf(x));
		}
		return Companhia;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public String getVoo() {
		return Voo;
	}

	public void setVoo(String voo) {
		Voo = voo;
	}

	public String getOrigem() {
		return Origem;
	}

	public void setOrigem(String origem) {
		Origem = origem;
	}

	public String getAtraso() {
		return Atraso;
	}

	public void setAtraso(String atraso) {
		Atraso = atraso;
	}

	@Override
	public String toString() {
		return "Voo [Hora=" + Hora + ", Voo=" + Voo + ", Origem=" + Origem + ", Atraso=" + Atraso + "]";
	}

	public Voo(String hora, String voo, String origem) {
		super();
		Hora = hora;
		Voo = voo;
		Origem = origem;
		Atraso = " ";
	}
	
	
	
	
	
	
	

}
