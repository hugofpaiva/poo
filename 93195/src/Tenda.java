import java.util.Collection;

public abstract class Tenda implements Expositor{
		private int num;
		String nome;
		
		public Tenda(int num, String nome) {
			super();
			this.num = num;
			this.nome = nome;
		}
		
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}

		@Override
		public String toString() {
			return "Tenda [num=" + num + ", nome=" + nome + "]";
		}
		
		

		
		

		
		
}
