package Aula12_B;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {
		main ap = new main();
		ap.alinea1();
		ap.alinea2();
		ap.alinea3();
	}

	public void alinea1() {
		Biblioteca bAveiro = new Biblioteca("Biblioteca Municipal de Aveiro",
				"Largo Dr. Jaime Magalhães Lima, 3800 - 156 Aveiro, Portugal");
		bAveiro.add(
				new Livro("História da Europa", "Lisboa: Dom Quixote", "Jean-Baptiste Duroselle", "972-20-0824-2"));
		bAveiro.add(new Livro("Papillon", "Amadora: Bertrand", "Henri Charrière"));
		bAveiro.add(new Livro("Branca de neve e os sete anões", "Abril Morumbi", "Jacob Grimm; Wilhelm Grimm"));
		bAveiro.add(new Revista("Revista municipal", "Aveiro: C.M.A.", "0874-727X"));
		bAveiro.add(new Jornal("Diário de notícias", Ver.CORES));
		Jornal gaf = new Jornal("O gafanhoto");
		gaf.setPeriodicidade(Period.BIMESTRAL);
		bAveiro.add(gaf);
		System.out.println(bAveiro);// imprime todas as publicações da biblioteca
		try {
			PrintWriter fl = new PrintWriter(new File("output.txt"));
			fl.println(bAveiro);
			fl.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void alinea2() {
		Biblioteca bAveiro = new Biblioteca("Biblioteca Municipal de Aveiro",
				"Largo Dr. Jaime Magalhães Lima, 3800 - 156 Aveiro, Portugal");
		bAveiro.add(
				new Livro("História da Europa", "Lisboa: Dom Quixote", "Jean-Baptiste Duroselle", "972-20-0824-2"));
		bAveiro.add(new Livro("Papillon", "Amadora: Bertrand", "Henri Charrière"));
		bAveiro.add(new Livro("Branca de neve e os sete anões", "Abril Morumbi", "Jacob Grimm; Wilhelm Grimm"));
		bAveiro.add(new Revista("Revista municipal", "Aveiro: C.M.A.", "0874-727X"));
		bAveiro.add(new Jornal("Diário de notícias", Ver.CORES));
		Jornal gaf = new Jornal("O gafanhoto");
		gaf.setPeriodicidade(Period.BIMESTRAL);
		bAveiro.add(gaf);
		System.out.println(bAveiro.printOrd());
	}

	public void alinea3() {
		try {
			Scanner read = new Scanner(new File("samples.txt"));
			Biblioteca sample = new Biblioteca("sample", "UA");
			while (read.hasNextLine()) {
				String line = read.nextLine();
				String[] palavras = line.split("\t");
				if (palavras[0].equals("1")) {
					sample.add(new Livro(palavras[1], palavras[2], palavras[3], palavras[4]));
				} else if (palavras[0].equals("2")) {
					sample.add(new Revista(palavras[1], palavras[2], palavras[4]));

				}

			}
			TreeMap<String, Integer> editoras = new TreeMap<String, Integer>();
			for(Publicacao x: sample.getPublicacoes()) {
				String edit = x.getEditora();
				if(editoras.keySet().contains(edit)) {
					int count = editoras.get(edit)+1;
					editoras.put(edit, count);
				}else {
					editoras.put(edit, 1);
				}
				
			}
			System.out.printf("%-30s%-15s\n", "Editora", "#publicações");
			for(String l: editoras.keySet()) {
				System.out.printf("%-30s%-15d\n", l, editoras.get(l));
			}
		} catch (FileNotFoundException e) {
			System.out.println("O ficheiro samples.txt não foi encontrado.");
		}

	}
}
