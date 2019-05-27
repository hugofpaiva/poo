package aula12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ex12_1 {

	public static void main(String[] args) {
		HashSet<String> palavrasD = new HashSet<String>();
		String t = "";
		int countT = 0;
		int countD = 0;
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Que ficheiro deseja ler");
			String x = input.nextLine();
			t=x;
			Scanner read = new Scanner(new File(x));
			while (read.hasNextLine()) {
				String line = read.nextLine();
				//String[] palavras = line.split("\t,\n,,,.,\",:,;,?,!,(,),/,*");
				String[] palavras = line.split("\\W");
				for (String i : palavras) {
					
					
					palavrasD.add(i);
					countT++;
				}
			}
			for(String l: palavrasD) {
				countD++;
			}
			System.out.println("Número Total de Palavras: "+countT);
			System.out.println("Número de Diferentes Palavras: "+countD);

		} catch (FileNotFoundException e) {
			System.out.println("O ficheiro " + t + " não foi encontrado.");
		}

	}
}
