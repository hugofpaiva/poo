package P08;

public class A08E03 { 
	
	public static void main(String[] args) { 
		Ementa ementa = new Ementa("Especial Primavera", "Snack da UA"); 
		Prato[] pratos = new Prato[10];
		
		for (int i=0; i < pratos.length; i++){ 
			pratos[i] = randPrato(i); 
			int cnt = 0; 
			
			while (cnt <2){ 
				// Adicionar 2 Ingredientes a cada Prato 
				Alimento aux = randAlimento(); 
				if (pratos[i].addIngrediente(aux)) 
					cnt++; 
				else 
					System.out.println("ERRO: Nao e possivel adicionar '" + aux + "' ao -> " + pratos[i]); 
				} 
			
			ementa.addPrato(pratos[i], DiaSemana.rand()); // Dia Aleatorio 
			
		} 
		
		System.out.println("\n" + ementa); 
		
	} 
		
	//-----------------------------------------------------------------------
	// Retorna um Alimento Aleatoriamente 
	
	public static Alimento randAlimento() { 
		switch ((int) (Math.random() * 4)) { 
		default: 
			case 0: 
				return new Carne(VariedadeCarne.FRANGO, 22.3, 345.3, 300); 
			case 1: 
				return new Peixe(TipoPeixe.CONGELADO, 31.3, 25.3, 200); 
			case 2: 
				return new Legume("Couve Flor", 21.3, 22.4, 150); 
			case 3: 
				return new Cereal("Milho", 19.3, 32.4, 110); 
			} 
		} 
	
	
	//-----------------------------------------------------------------------
	// Retorna um Tipo de Prato Aleatoriamente 
	
	public static Prato randPrato(int i) { 
		switch ((int) (Math.random() * 3)) { 
		default: 
			case 0: 
				return new Prato("Prato N." + i); 
			case 1: 
				return new PratoVegetariano("Prato N." + i + " (Vegetariano)"); 
			case 2: 
				return new PratoDieta("Prato N." + i + " (Dieta)", 90.8); 
			} 
		} 
}
