package aula04;

import java.util.Scanner;

public class Ex4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		System.out.println("Qual a frase?");
		frase = sc.nextLine();
		frase = frase.replaceAll("\\s+", " ");
		String acronimo = "";
		String[] a = frase.split(" ");
		for(String x:a) {
			if(x.length()>=3 && Character.isUpperCase(x.charAt(0))) {
				acronimo += x.charAt(0);
			}
		}
		System.out.println(acronimo);
		
	}

}
