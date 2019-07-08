import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bar extends Tenda{
	private List<Bebida> lista = new ArrayList<>();

	public Bar(int num, String nome) {
		super(num, nome);
	}

	public Bar(int num, String nome, List<Bebida> lista) {
		super(num, nome);
		this.lista = lista;
	}

	public int totalProdutos() {
		return this.lista.size();
	}

	public List<Bebida> getLista() {
		return lista;
	}

	public void setLista(List<Bebida> conjunto) {
		this.lista = conjunto;
	}

	public void add(Bebida bebi) {
		this.lista.add(bebi);
	}
	
	@Override
	public Collection<String> items() {
		Collection<String>returnar =new ArrayList<>();
		for(Bebida b:lista) {
			returnar.add(b.toString());
		}
		
		return returnar;
	}

}
