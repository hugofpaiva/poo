import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Tasquinha extends Tenda{
	Set<String> pratos = new HashSet<>();
	
	public Tasquinha(int num, String nome) {
		super(num, nome);
		
	}

	public Tasquinha(int num, String nome, String[] pratos) {
		super(num, nome);
		for(String p: pratos) {
			this.pratos.add(p);
		}
		
	}

	public Set<String> getPratos() {
		return pratos;
	}

	public void setPratos(Set<String> pratos) {
		this.pratos = pratos;
	}
	
	public void addPrato(String prato) {
		this.pratos.add(prato);
		
	}

	@Override
	public Collection<String> items() {
		Collection<String>returnar =new ArrayList<>();
		for(String p:pratos) {
			returnar.add(p.toString());
		}
		
		return returnar;
	}
	
	
	
	
	

}
