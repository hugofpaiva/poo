package aula07;

public abstract class Obj_Movel {
	private double x,y,vmax,distperc;

	public Obj_Movel(double x, double y, double vmax) {
		this.x = x;
		this.y = y;
		this.vmax = vmax;
	}
	
	public double getX() {
		return x;
	}



	public void setX(double x) {
		this.x = x;
	}



	public double getY() {
		return y;
	}



	public void setY(double y) {
		this.y = y;
	}



	public double getVmax() {
		return vmax;
	}



	public void setVmax(double vmax) {
		this.vmax = vmax;
	}



	public double getDistperc() {
		return distperc;
	}



	public void setDistperc(double distperc) {
		this.distperc = distperc;
	}


	// Função que calcula a distância percorrida e implementa os novos pontos
	public double move(double newX, double newY) {
		distperc=Math.sqrt(Math.pow(newX-x, 2)+Math.pow(newY-y,2));
		x = newX;
		y = newY;
		return distperc;
		
	}
	
	
	
	

}
