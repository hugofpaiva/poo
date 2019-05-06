package aula09;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import aula06.Aluno;
import aula06.Data;
import aula06.Pessoa;

public class Ex9_1 {
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> c1 = new ArrayList<>(); 
		for (int i = 10; i <= 100; i+=10)
			c1.add(i);
		System.out.println("Size: " + c1.size()); 
		for (int i = 0; i < c1.size(); i++)
			System.out.println("Elemento: " + c1.get(i));
		
		ArrayList<String> c2 = new ArrayList<>(); 
		c2.add("Vento");
		c2.add("Calor");
		c2.add("Frio");
		c2.add("Chuva"); 
		System.out.println(c2); 
		Collections.sort(c2); 
		System.out.println(c2); 
		c2.remove("Frio"); 
		c2.remove(0); 
		System.out.println(c2);
		
		// Exercício a)
		System.out.println("Implementações:");
		System.out.println();
		
		//Se c2 contém uma palavra
		System.out.println("Escreva uma palavra para verificar se está no ArrayList");
		String check = sc.next();
		if(c2.contains(check)) {
			System.out.println(check + " está no ArrayList c2");
		}
		else {
			System.out.println(check + " não está no ArrayList c2");
		}
		
		// Adicionar um elemente ao c2
		
		System.out.println("Escreva uma palavra para adicionar ao ArrayList");
		String add = sc.next();
		c2.add(add);
		
		//Ver o index de um elemento
		
		System.out.println("Escreva uma palavra para o index no ArrayList");
		String index = sc.next();
		
		if(c2.indexOf(index) != -1) {
			System.out.println(c2.indexOf(index));
		}
		else {
			System.out.println("Não está no ArrayList");
		}
		
		//Implementar o lastIndexOf
		
		for (int i = 0; i < 5; i++) {
			c2.add("Colher");
		}
		System.out.println("ArrayList: " + c2);
		int li;
		li = c2.lastIndexOf("Colher");
		System.out.println("O último index da Colher é: "+li);
		
		// Implementar o Set
		
		System.out.println("ArrayList: " + c2);
		int pos =-1;
		while(pos<0 || pos>c2.size()) {
		System.out.println("Escreva a posição que quer substituir");
		pos = sc.nextInt();
		}
		
		System.out.println("Escreva a palavra pela qual que quer substituir");
		String palavra = sc.next();
		c2.set(pos, palavra);
		
		//Implementar o size
		
		System.out.println("O tamanho de c2 é: "+c2.size());
		
		//Implemente o subList
		
		System.out.println("Vamos ver que elementos temos entre dois indexs!");
		System.out.println("Escreva o Index incial");
		int iii = sc.nextInt();
		System.out.println("Escreva o Index final");
		int iff = sc.nextInt();
		System.out.println(c2.subList(iii, iff));
		
		//Remover um elemento
		
		System.out.println("ArrayList: "+c2);
		String remove = "";
		while(!c2.contains(remove)) {
			System.out.println("Escreva um elemento que quer remover");
			remove = sc.next();
			
		}
		c2.remove(remove);
		System.out.println("ArrayList Final: "+c2);
		
		
		// Exercício b)
		
		Set<Pessoa> c3 = new HashSet<>();
		Pessoa p1 = new Pessoa ("Andreia Melo", 9855678,new Data(18, 7, 1990));
		Pessoa p2 = new Pessoa ("Eduardina Santina", 98556789,new Data(18, 7, 1991));
		Pessoa p3 = new Pessoa ("Bastina Basta", 9855672,new Data(18, 7, 1995));
		Pessoa p4 = new Pessoa ("Basta Bastina", 9855673,new Data(18, 7, 1992));
		Pessoa p5 = new Pessoa ("Basta Bastos", 9855674,new Data(18, 7, 1994));
		c3.add(p1);
		c3.add(p2);
		c3.add(p3);
		c3.add(p4);
		c3.add(p5);
		c3.add(p5); //- Não aparece na listagem pq é um set
		
		Iterator<Pessoa> itr = c3.iterator();
		while(itr.hasNext()) {
	         Pessoa element = itr.next();
	         System.out.print(element + " ");
	         System.out.println();
	      }
	      System.out.println();
		
		
		// Exercício c)
	      
	    Set<Data> c4 = new TreeSet<>();
	    Data d1 = new Data (21,11,2000);
	    Data d2 = new Data (21,11,1999);
	    Data d3 = new Data (21,11,1998);
	    Data d4 = new Data (21,11,1997);
	    Data d5 = new Data (21,11,1996);
	    c4.add(d1);
		c4.add(d2);
		c4.add(d3);
		c4.add(d4);
		c4.add(d5);
		c4.add(d5);
	    
	    Iterator<Data> itr1 = c4.iterator();
		while(itr1.hasNext()) {
	         Data element = itr1.next();
	         System.out.print(element + " ");
	         System.out.println();
	      }
	      System.out.println();
	    
	    
		
		
		
		
		
		
		
		
		
			
		}

}
