package aula08.Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class A08E03 { 
	
	static Scanner sc;
	static Ementa ementa;
	static ArrayList<Alimento> alimentos = new ArrayList<>();
	
	public static void main(String[] args) { 
		ementa = new Ementa("Especial Primavera", "Snack da UA"); 
		Prato[] pratos = new Prato[10];
		sc = new Scanner(System.in);
		menu();
		
		sc.close();
		
	} 
	
	

	private static void imprimirEmenta() {
		System.out.println("\n" + ementa); 
		if(!ementa.isEmpty()) {
			for(int i = 0; i < ementa.size() ; i++) {
				System.out.println(ementa.getElement(i));
				ementa.getElement(i);
			}
		} else {
			System.out.println("\nEmenta vazia!");
		}
		
	}

	private static void adicionarLegume() {
		System.out.println("Legume: ");
		String l = sc.nextLine();
		alimentos.add(new Legume(l, (Math.random() * 300), (Math.random() * 300), (Math.random() * 300)));
	}

	private static void adicionarCereal() {
		System.out.println("Cereal: ");
		String c = sc.nextLine();
		alimentos.add(new Cereal(c, (Math.random() * 300), (Math.random() * 300), (Math.random() * 300)));
		
	}

	private static void adicionarPeixe() {
		TipoPeixe tipo = null;
		switch((int)(Math.random() * 2)) {
		case 1:
			tipo = TipoPeixe.CONGELADO; break;
		case 2:
			tipo = TipoPeixe.FRESCO; break;
		
		}
		alimentos.add(new Peixe(tipo, (Math.random() * 300), (Math.random() * 300), (Math.random() * 300)));
		
	}

	private static void adicionarCarne() {
		VariedadeCarne variedade = VariedadeCarne.OUTRA;
		switch((int)(Math.random() * 4)) {
		case 1:
			variedade = VariedadeCarne.VACA; break;
		case 2:
			variedade = VariedadeCarne.PORCO; break;
		case 3:
			variedade = VariedadeCarne.PERU; break;
		case 4:
			variedade = VariedadeCarne.FRANGO; break;
		
		}
		alimentos.add(new Carne(variedade, (Math.random() * 300), (Math.random() * 300), (Math.random() * 300)));
		
	}
	
	private static void menu() {
        int choice = 0;
        do{
        	System.out.println("\n\nIngrediente");
        	System.out.println("[ 1] Adicionar Carne");
            System.out.println("[ 2] Adicionar Peixe");
            System.out.println("[ 3] Adicionar Cereal");
            System.out.println("[ 4] Adicionar Legume");
            System.out.println("Prato");
            System.out.println("[ 5] Criar Prato");
            System.out.println("[ 6] Apagar Prato");
            System.out.println("[ 7] Adicionar Ingrediente");
            System.out.println("[ 8] Selecionar Prato");
            System.out.println("[ 9] Remover Ingrediente");
            System.out.println("Ementa");
            System.out.println("[10] Adicionar Prato");
            System.out.println("[11] Remover Prato");
            System.out.println("[12] Imprimir Ementa");
            System.out.println("[13] Sair");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    adicionarCarne();
                    break;
                case 2:
                    adicionarPeixe();
                    break;
                case 3:
                    adicionarCereal();
                    break;
                case 4:
                    adicionarLegume();
                    break;
                /*case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                    
                    break;
                    
                case 11:
                
               		break;*/
                    
                case 12:
                	imprimirEmenta();
                	break;
                case 13:
                    System.exit(0);
            }
        }while(choice != 13);
		
}
}
	
