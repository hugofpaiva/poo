package aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_1 {

	public static void main(String[] args) {
		ArrayList<String> palavras = new ArrayList<String>();
		try {
			Scanner input = new Scanner(new File("words.txt"));
			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
				System.out.println(line.length());
				String[] palavrass = line.split("\\W");
				for (String i : palavrass) {
					if (i.length() >= 3) {
						palavras.add(i);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("O ficheiro " + e + " não foi encontrado.");
		}
		System.out.println(palavras);
		for (String x : palavras) {
			
		}

	}

}
