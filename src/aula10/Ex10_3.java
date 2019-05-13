package aula10;

import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ex10_3 {
	
	public static void main(String[] args) {
		Map<String, Set<String>> termosign = new TreeMap<String, Set<String>>();
		Random r = new Random();
		
		String c1 = "Branco";
		Set<String> c11 = new HashSet<>();
		c11.add("Que tem a cor da neve");
		c11.add("Descorado, pálido.");
		c11.add("Cor de leite");
		String c2 = "Amarelo";
		Set<String> c12 = new HashSet<>();
		c12.add("Que tem a dos Simpsons");
		c12.add("Cor do ecoponto dos plásticos");
		c12.add("Cor do Sol");
		String c3 = "Preto";
		Set<String> c13 = new HashSet<>();
		c13.add("Que tem a do Batman");
		c13.add("Cor do infinito");
		c13.add("Cor de carros");
		String c4 = "Vermelho";
		Set<String> c14 = new HashSet<>();
		c14.add("Que tem a do Deadpool");
		c14.add("Cor do Spider-Man");
		c14.add("Cor de carros");
		String c5 = "Verde";
		Set<String> c15 = new HashSet<>();
		c15.add("Que tem a da erva");
		c15.add("Cor do Sporting");
		c15.add("Cor de relva");
		termosign.put(c1, c11);
		termosign.put(c2, c12);
		termosign.put(c3, c13);
		termosign.put(c4, c14);
		termosign.put(c5, c15);
		System.out.println("Estrutura inicial: "+ termosign);
		
		Scanner input = new Scanner(System.in);
		String cont = "y";
		while(cont=="y") {
			Set<String> edit = new HashSet<>();
			System.out.println("Que key quer mudar?");
			String key = input.next();
			System.out.println("Para que value?");
			String val = input.next();
			edit.add(val);
			System.out.println("Queres acrescentar mais values?(y/n)");
			String add = input.next();
			while(add.equals("y")) {
				System.out.println("Para que value?");
				val = input.next();
				edit.add(val);
				System.out.println("Queres acrescentar mais values?(y/n)");
				add = input.next();
			}
			termosign.put(key, edit);
			System.out.println("Queres mudar mais?(y/n)");
			cont = input.next();
		}
		
		String conti="y";
		while(conti=="y") {
			System.out.println("Que elemento(key) deseja remover?");
			String remove = input.next();
			termosign.remove(remove);
			System.out.println("Queres remover mais?(y/n)");
			conti = input.next();
		
		}
		String termoAl ="";
		int al = r.nextInt(5);
		int c=0;
		for(String x:termosign.keySet()) {
			if(c==al) {
				termoAl=x;
			}
			c++;
		}
		System.out.println("Significado (escolhido aleatoriamente), do termo (escolhido aleatóriamente) "+termoAl+": "+significado(termosign, termoAl));
		
		System.out.println("Estrutura final: "+ termosign);
		System.out.println("Estrutura final(termos): "+ termosign.keySet());
		System.out.println("Estrutura final(significados): "+ termosign.values());
		
		
		
	}
	
	public static String significado(Map<String, Set<String>> x, String y) {
		String termoAl ="";
		Random r = new Random();
		int al = r.nextInt(x.get(y).size());
		int c=0;
		for(String i:x.get(y)) {
			if(c==al) {
				termoAl=i;
			}
			c++;
		}
		
		
		return termoAl;
		
		
	}

}
