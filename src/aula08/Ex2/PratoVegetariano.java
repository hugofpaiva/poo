package aula08.Ex2;

public class PratoVegetariano extends Prato {

	
	public PratoVegetariano(String nome, DiaSemana diaSem) {
		super(nome, diaSem);
	}
	
	public PratoVegetariano(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		return "Vegetariano Prato '" + getNome() + "', composto por " + getNIngredientes() + " ingredientes, dia " + getDiaSem();
	}

}
