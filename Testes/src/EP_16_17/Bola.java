package EP_16_17;

public class Bola extends ObjetoMovel{
	private CorDaBola cor;
	private static int nBolas;

	public CorDaBola getCor() {
		return cor;
	}



	public void setCor(CorDaBola cor) {
		this.cor = cor;
	}
	


	public Bola(CorDaBola cor) {
		super(0,0);
		this.cor = cor;
		nBolas+=1;
	}



	public Bola(int x, int y, double velocidade, double distancia, CorDaBola cor) {
		super(x, y, velocidade, distancia);
		this.cor = cor;
		nBolas+=1;
	}
	
	
	
	

	public static int getnBolas() {
		return nBolas;
	}



	public static void setnBolas(int nBolas) {
		Bola.nBolas = nBolas;
	}



	@Override
	public String toString() {
		return "A Bola tem a " + cor + ", o x " + getX() + ", o y " + getY()
				+ ", a velocidade" + getVelocidade() + " e a Distancia " + getDistancia();
	}
	
	

	
	
	
	

}
