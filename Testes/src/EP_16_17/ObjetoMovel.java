package EP_16_17;

public class ObjetoMovel {
	private int x,y;
	private double velocidade, distancia;
	
	public ObjetoMovel(int x, int y, double velocidade, double distancia) {

		this.x = x;
		this.y = y;
		this.velocidade = velocidade;
		this.distancia = distancia;
	}
	
	public ObjetoMovel(int x, int y) {

		this.x = x;
		this.y = y;
		
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public void move(int newX, int newY) {
		distancia += Math.sqrt(Math.pow(newX-x, 2)+Math.pow(newY-y, 2));
		x = newX;
		y = newY;
		
	}
	
	public void move(int newX, int newY, double velocidade) {
		distancia+= Math.sqrt(Math.pow(newX-x, 2)+Math.pow(newY-y, 2));
		x = newX;
		y = newY;
		
	}
	
	
	

}
