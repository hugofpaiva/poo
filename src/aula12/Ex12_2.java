package aula12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import aula11.Voo;

public class Ex12_2 {

	public static void main(String[] args) {
		HashSet<String> genre = new HashSet<String>();
		ArrayList<Movie> movies = new ArrayList<Movie>();
		try {
			Scanner read = new Scanner(new File("movies.txt"));
			String init = read.nextLine();
			String[] arrayinit = init.split("\t");
			while (read.hasNextLine()) {
				String line = read.nextLine();
				String[] palavras = line.split("\t");
				movies.add(new Movie(palavras[0], palavras[1], palavras[2], palavras[3], palavras[4]));
				
			}

			// Ordenado pelo nome do filme
			System.out.println("Ordenado pelo nome do filme\n");
			movies.sort((p1, p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase()));
			System.out.printf("%-40s%-10s%-12s%-15s%-12s\n", arrayinit[0], arrayinit[1], arrayinit[2], arrayinit[3],
					arrayinit[4]);
			for (Movie i : movies) {
				System.out.println(i);
			}
			System.out.println();
			// Ordenado por ordem decrescente de score
			System.out.println("Ordenado por ordem decrescente de score\n");
			movies.sort((p2, p1) -> p1.getScore().compareTo(p2.getScore()));
			System.out.printf("%-40s%-10s%-12s%-15s%-12s\n", arrayinit[0], arrayinit[1], arrayinit[2], arrayinit[3],
					arrayinit[4]);
			for (Movie i : movies) {
				System.out.println(i);
			}
			System.out.println();

			// Ordenado por ordem crescente de "running time"
			System.out.println("Ordenado por ordem crescente de \"running time\"\n");
			movies.sort((p1, p2) -> p1.getTime().compareTo(p2.getTime()));
			System.out.printf("%-40s%-10s%-12s%-15s%-12s\n", arrayinit[0], arrayinit[1], arrayinit[2], arrayinit[3],
					arrayinit[4]);
			for (Movie i : movies) {
				System.out.println(i);
			}

			// Imprimir os géneros, distintos
			for (Movie i : movies) {
				genre.add(i.getGenre());
			}
			System.out.print("\nOs géneros existentes são: ");
			for (String i : genre) {
				if (i.equals("suspense")) {
					System.out.printf("%s. ", i);
				} else if(i.equals("action")){
					System.out.printf("%s e ", i);
				}else {
					System.out.printf("%s, ", i);
				}
			}

			// Escrever no ficheiro “myselection.txt” os filmes com um score superior a 60 e que pertençam ao género comedy
			movies.sort((p1, p2) -> p1.getScore().compareTo(p2.getScore()));
			try {
				PrintWriter writer = new PrintWriter("myselection.txt");
				writer.printf("%-40s%-10s%-12s%-15s%-12s\n", arrayinit[0], arrayinit[1], arrayinit[2], arrayinit[3],
						arrayinit[4]);
				for (Movie i : movies) {
					if (i.getScore() > 60 && i.getGenre().equals("comedy")) {
						writer.println(i);
					}
				}
				writer.close();
			} catch (FileNotFoundException e) {
				System.out.println("Não foi possivel escrever.");
			}

		} catch (FileNotFoundException e) {
			System.out.println("O ficheiro movies.txt não foi encontrado.");
		}
	}

}
