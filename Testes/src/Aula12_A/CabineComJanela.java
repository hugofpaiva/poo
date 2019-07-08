package Aula12_A;

public class CabineComJanela extends Cabine{
	private TipoDeJanela janela;
	private Extra pacoteExtra;

	public CabineComJanela(int numero, int capmax, TipoDeJanela janela, String[] ocupantes) {
		super(numero, capmax, ocupantes);
		this.janela = janela;
	}

	public CabineComJanela(int numero, int capmax, TipoDeJanela janela) {
		super(numero, capmax);
		this.janela = janela;
	}

	public TipoDeJanela getJanela() {
		return janela;
	}

	public void setJanela(TipoDeJanela janela) {
		this.janela = janela;
	}
	
	public Extra getpacoteExtra() {
		return pacoteExtra;
	}



	public void pacoteExtra(Extra pacoteExtra) {
		this.pacoteExtra = pacoteExtra;
	}

	
	
	
	

}
