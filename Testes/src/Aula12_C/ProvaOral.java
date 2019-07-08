package Aula12_C;

public class ProvaOral extends Teste{
	private Lingua ling;
	
	public ProvaOral(String disciplina, String professor, String data, String salas, Lingua uk) {
		super(disciplina, professor, data, salas);
		this.ling=uk;
	}

}
