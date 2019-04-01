package aula07;

public class Robo extends Obj_Movel{
	private String tipo;
	private int id;
	private int golos;
	private static int currentid=0;
	//O Tipo irá ter apenas 3 opções delimitadas no menu da função main
	public Robo(double x, double y, double vmax, String tipo) {
		super(x, y, vmax);
		this.tipo = tipo;
		this.id = currentid;
		currentid+=1;
		
	}
	
	public void marcar(Equipa x) {
		golos+=1;
		x.goloss+=1;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public int getGolos() {
		return golos;
	}



	public void setGolos(int golos) {
		this.golos = golos;
	}



	public void marcar() {
		golos+=1;
	}



	
	
	
	

}
