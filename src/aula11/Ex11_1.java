package aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex11_1 {

	public static void main(String[] args) {
		ArrayList<String> palavras = new ArrayList<String>();
		HashMap<String, HashMap<String, Integer>> wordmain = new HashMap<>();
		try {
			//Scanner input = new Scanner(new File("words1.txt"));
			Scanner input = new Scanner(new File("major.txt"));
			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] palavrass = line.split("\\W");
				for (String i : palavrass) {
					if (i.length() >= 3) {
						palavras.add(i);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("O ficheiro não foi encontrado.");
		}
		System.out.println(palavras);
		/*
		 * for (String x : palavras) { int par = 0; int pos = palavras.indexOf(x); pos
		 * += 1; par += 1; if (pos < palavras.size()) { String palavrafrente =
		 * palavras.get(pos); for (int l = palavras.indexOf(x) + 2; l < palavras.size();
		 * l++) { if (palavras.get(l) == x && palavras.get(l + 1) == palavrafrente) {
		 * par += 1; }
		 * 
		 * 
		 * 
		 * 
		 * } } } System.out.println(wordmain);
		 */
		HashMap<String, HashMap<String, Integer>> m = new HashMap<>();
		for (int i = 0; i < palavras.size(); i++) {
			HashMap<String, Integer> temp = new HashMap<>();
			if (m.containsKey(palavras.get(i))) {
				temp = m.get(palavras.get(i));
				if (temp.containsKey(palavras.get(i + 1)) && i < palavras.size()) {
					temp.put(palavras.get(i + 1), temp.get(palavras.get(i + 1)) + 1);
					m.put(palavras.get(i), temp);
				} else {
					temp.put(palavras.get(i + 1), 1);
					m.put(palavras.get(i), temp);
				}
			} else {
				if (i < palavras.size() - 1) {
					if (temp.containsKey(palavras.get(i + 1))) {
						temp.put(palavras.get(i + 1), temp.get(palavras.get(i + 1)) + 1);
						m.put(palavras.get(i), temp);
					} else {
						temp.put(palavras.get(i + 1), 1);
						m.put(palavras.get(i), temp);
					}
				}
			}
		}

		for (String x : m.keySet()) {
			System.out.println(x + "=" + m.get(x));
		}

	}

}
