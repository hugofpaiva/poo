import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Mercado {
	private String nome, endereco;

	Comparator<Tenda> ordenar = new Comparator<Tenda>() {
		@Override
		public int compare(Tenda o1, Tenda o2) {
			String x1 = String.valueOf(o1.getNum());
			String x2 = String.valueOf(o2.getNum());
			
			return x1.compareTo(x2);

		}
	};

	Set<Tenda> tendas = new TreeSet<>(ordenar);

	public Mercado(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Set<Tenda> tendas() {
		return tendas;
	}

	public void setTendas(Set<Tenda> tendas) {
		this.tendas = tendas;
	}

	public void add(Tenda t) {
		this.tendas.add(t);

	}

	public int totalItems() {
		int total = 0;
		for (Tenda t : tendas) {
			if (t instanceof Tasquinha) {
				total += ((Tasquinha) t).getPratos().size();
			} else if (t instanceof Bar) {
				total += ((Bar) t).getLista().size();
			}
		}
		return total;
	}

	public Set<String> getAllItems() {
		Set<String> items = new TreeSet<>();
		for (Tenda t : tendas) {
			if (t instanceof Tasquinha) {
				for (String p : ((Tasquinha) t).getPratos()) {
					items.add(p);
				}
			} else if (t instanceof Bar) {
				for (Bebida b : ((Bar) t).getLista()) {
					items.add(b.getNome());
				}
			}

		}
		return items;
	}

	@Override
	public String toString() {
		return "Mercado " + nome + "\n\t Tendas: " + tendas.toString();
	}

}
