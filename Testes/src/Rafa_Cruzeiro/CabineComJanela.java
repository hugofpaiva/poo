package Rafa_Cruzeiro;


public class CabineComJanela extends Cabine {
	
	private TipoDeJanela tipoDeJanela;
	private Extra pacoteExtra;

	public CabineComJanela(int num, int maxOcupantes, TipoDeJanela tipoDeJanela, String[] passageiros) {
		super(num, maxOcupantes, passageiros);
		this.tipoDeJanela = tipoDeJanela;
	}
	
	public CabineComJanela(int num, int maxOcupantes, TipoDeJanela tipoDeJanela) {
		super(num, maxOcupantes);
		this.tipoDeJanela = tipoDeJanela;
	}

	public void pacoteExtra(Extra pacoteExtra) {
		this.pacoteExtra = pacoteExtra;
	}

	@Override
	public String toString() {
		return "Cabine com Janela "+ tipoDeJanela+" "+super.toString();
	}

	
	//UNIVERSAL
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((pacoteExtra == null) ? 0 : pacoteExtra.hashCode());
		result = prime * result + ((tipoDeJanela == null) ? 0 : tipoDeJanela.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CabineComJanela other = (CabineComJanela) obj;
		if (pacoteExtra != other.pacoteExtra)
			return false;
		if (tipoDeJanela != other.tipoDeJanela)
			return false;
		return true;
	}

	
	
	

	
	

}
