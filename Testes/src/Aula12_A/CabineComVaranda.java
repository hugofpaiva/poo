package Aula12_A;

public class CabineComVaranda extends Cabine{
	private TipoDeVaranda tipoVaranda;
	private Extra pacoteExtra;

	public CabineComVaranda(int numero, int capmax, TipoDeVaranda tipoVaranda, String[] ocupantes) {
		super(numero, capmax, ocupantes);
		this.tipoVaranda = tipoVaranda;
	}

	public CabineComVaranda(int numero, int capmax, TipoDeVaranda tipoVaranda) {
		super(numero, capmax);
		this.tipoVaranda = tipoVaranda;
	}

	public TipoDeVaranda getTipoVaranda() {
		return tipoVaranda;
	}

	public void setTipoVaranda(TipoDeVaranda varanda) {
		this.tipoVaranda = varanda;
	}
	
	public Extra getpacoteExtra() {
		return pacoteExtra;
	}



	public void pacoteExtra(Extra pacoteExtra) {
		this.pacoteExtra = pacoteExtra;
	}

	
	

	
	
	

}
