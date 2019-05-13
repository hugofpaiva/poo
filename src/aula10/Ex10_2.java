package aula10;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Ex10_2 {
	
	public static void main(String[] args) {
		HashMap<String, String> termosign = new HashMap<String, String>();
		termosign.put("Branco", "Que tem a cor da neve.");
		termosign.put("Amarelo", "Que tem a cor dos Simpsons.");
		termosign.put("Preto", "Que tem a cor do Batman.");
		termosign.put("Vermelho", "Que tem a cor do Deadpool.");
		termosign.put("Verde", "Que tem a cor da erva.");
		System.out.println("Estrutura inicial: "+ termosign);
		Scanner input = new Scanner(System.in);
		String cont = "y";
		while(cont=="y") {
			System.out.println("Que key quer mudar?");
			String key = input.next();
			System.out.println("Para que value?");
			String val = input.next();
			termosign.put(key, val);
			System.out.println("Queres mudar mais?(y/n)");
			cont = input.next();
		}
		String conti="y";
		while(conti=="y") {
			System.out.println("Que elemento(key) deseja remover?)");
			String remove = input.next();
			termosign.remove(remove);
			System.out.println("Queres remover mais?(y/n)");
			conti = input.next();
		
		}
		System.out.println("Estrutura final: "+ termosign);
		System.out.println("Estrutura final(termos): "+ termosign.keySet());
		System.out.println("Estrutura final(significados): "+ termosign.values());
		
	}

}
