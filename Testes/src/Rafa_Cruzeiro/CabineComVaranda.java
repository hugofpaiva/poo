package Rafa_Cruzeiro;


public class CabineComVaranda extends Cabine{

	private TipoDeVaranda tipoVaranda;
	private Extra pacoteExtra;
	
	public CabineComVaranda(int num, int maxOcupantes, String[] passageiros) {
		super(num, maxOcupantes, passageiros);
	}
	
	public CabineComVaranda(int num, int maxOcupantes) {
		super(num, maxOcupantes);
	}
	
	public CabineComVaranda(int num, int maxOcupantes, TipoDeVaranda tipoVaranda) {
		super(num, maxOcupantes);
		this.tipoVaranda = tipoVaranda;
	}

	
	public void setTipoVaranda(TipoDeVaranda tipoDVaranda) {
		this.tipoVaranda = tipoVaranda;
	}

	public void pacoteExtra(Extra pacoteExtra) {
		this.pacoteExtra = pacoteExtra;
	}

	@Override
	public String toString() {
		return "Cabine com Varanda "+ tipoVaranda+" "+super.toString();
	}

	//UNIVERSAL
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((pacoteExtra == null) ? 0 : pacoteExtra.hashCode());
		result = prime * result + ((tipoVaranda == null) ? 0 : tipoVaranda.hashCode());
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
		CabineComVaranda other = (CabineComVaranda) obj;
		if (pacoteExtra != other.pacoteExtra)
			return false;
		if (tipoVaranda != other.tipoVaranda)
			return false;
		return true;
	}

	
	
	
	
	
}
