package aula04;

import java.util.Scanner;

public class Ex4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		System.out.println("Qual a frase?");
		frase = sc.nextLine();
		System.out.printf("Existem %d números de carateres numéricos \n", countDigits(frase) );
		System.out.printf("Existem %d espaços \n", countSpace(frase) );
		if(verifymin(frase)) {
			System.out.println("Só existem minúsculas!");
		}
		else {
			System.out.println("Existem maiúsculas!");
		}
		System.out.printf("%s \n", space(frase));
		if(palin(frase)) {
			System.out.println("É palíndromo!");
		}
		else {
			System.out.println("Não é palíndromo!");
		}
		
	}
	public static int countDigits(String s) {
		int count = 0;
		for(int i=0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				count++;
				
			}
		}
		return count;
	}
	
	public static int countSpace(String s) {
		int count = 0;
		for(int i=0; i < s.length(); i++) {
			String chare = Character.toString(s.charAt(i));
			if(chare.equals(" ")) {
				count++;
				
			}
		}
		return count;
	}
	
	public static boolean verifymin(String s) {
		int count = 0;
		for(int i=0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				return false;
			}
		}
		return true;

	}
	
	public static String space(String s) {
		return s.replaceAll("\\s+", " ");
			
		}
	
	public static boolean palin(String s) {
		for (int i = 0; i<Math.round(s.length()/2); i++) {
			if (s.charAt(i) != (s.charAt(s.length()-1-i))){
				return false;	
			}
		}
		return true;
	}
}


