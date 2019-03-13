package aula04;
import java.util.Scanner;

public class Ex4_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase, addfrase;
		System.out.println("Qual a frase?");
		frase = sc.nextLine();
		System.out.printf("A frase em minúsculas é: %s \n", frase.toLowerCase());
		
		int length = frase.length();
		
		System.out.printf("O último caracter é: %s \n", frase.substring(length-1));
		
		System.out.printf("Os primeiros três carateres são: %s \n", frase.substring(0, 3));
		
		// Agora utilizando três outros métodos
		// Método Concat
		
		System.out.println("Agora escreva o que deseja acrescentar à frase inicial");
		addfrase = sc.nextLine();
		System.out.printf("A frase final fica: %s \n", frase.concat(addfrase));
		
		// Método Replace
		System.out.println("Indique o carater que quer substituir");
		String oldC, newC;
		oldC = sc.next();
		System.out.println("Indique por qual carater quer substituir o anterior");
		newC = sc.next();
		System.out.printf("A frase final fica: %s \n", frase.replace(oldC, newC));
		
		//Método Contains
		System.out.println("Indique a palavra que quer verificar se está na frase");
		String palavra;
		palavra = sc.next();
		if (frase.contains(palavra)) {
			System.out.println("A palavra está na frase!");
		}
		else {
			System.out.println("A palavra não está na frase!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
