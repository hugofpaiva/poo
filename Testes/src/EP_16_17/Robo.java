package EP_16_17;

public class Robo extends ObjetoMovel{
	private String id;
	private TipoJogador tipo;
	private String posicao;
	private String clube;
	private int numgolos=0;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public TipoJogador getTipo() {
		return tipo;
	}
	public void setTipo(TipoJogador tipo) {
		this.tipo = tipo;
	}
	public int getGolos() {
		return numgolos;
	}
	public void setNumgolos(int numgolos) {
		this.numgolos = numgolos;
	}
	public Robo(String id, TipoJogador tipo,int x, int y) {
		super(x, y);
		this.id = id;
		this.tipo = tipo;
	
	}
	public String getPosicao() {
		return posicao;
	}
	
	public String getEquipa() {
		return clube;
	}
	
	public Robo(String id, TipoJogador tipo) {
		super(0, 0);
		this.id = id;
		this.tipo = tipo;
	
	}
	
	public Robo(String id, String clube, String posicao) {
		super(0, 0);
		this.clube = clube;
		this.id = id;
		this.posicao = posicao;
	
	}
	
	public void marcaGolo() {
		this.numgolos++;
	}
	
	public String mostrar() {
		return " O Robo " + id + " que joga na equipa " + clube + " tem a posição " + posicao+".\n";
	}
	
	
	@Override
	public String toString() {
		return " O Robo " + id + " que joga a " + tipo + " marcou " + numgolos+"\n";
	}
	
	
	
	
	

}
