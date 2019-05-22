package aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_2 {

	public static void main(String[] args) {
		ArrayList<String> Companhias = new ArrayList<String>();
		ArrayList<Voo> voos = new ArrayList<Voo>();
		try {
			Scanner inputv = new Scanner(new File("voos.txt"));
			Scanner inputc = new Scanner(new File("companhias.txt"));
			// String tempor = inputv.nextLine();
			while (inputv.hasNextLine()) {
				String line = inputv.nextLine();
				String[] Voostemp = line.split("\t");
				if (Voostemp.length == 4) {
					voos.add(new Voo(Voostemp[0], Voostemp[1], Voostemp[2], Voostemp[3]));

				} else {
					voos.add(new Voo(Voostemp[0], Voostemp[1], Voostemp[2]));
				}

				// String[] Voostemp = line.split("\t");
				/*
				 * for (String i : Voostemp) { l++; if (l <= 4) { continue; }
				 * System.out.println(i);
				 * 
				 * }
				 */
			}
			while (inputc.hasNextLine()) {
				String line = inputc.nextLine();
				String[] Companhiatemp = line.split("\t");
				for (String i : Companhiatemp) {
					Companhias.add(i);

				}
			}
			inputv.close();
			inputc.close();

		} catch (FileNotFoundException e) {
			System.out.println("O ficheiro não foi encontrado.");
		}
		try {
			PrintWriter writer = new PrintWriter("Infopublico.txt");
			for (Voo i : voos) {
				writer.println(i);
			}
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("O ficheiro não foi encontrado.");
		}
		int count = 0;
		for (Voo i : voos) {
			System.out.println(i);
			/*String companhia = i.getCompanhia();
			String Atraso = i.getAtraso();
			String[] delay = Atraso.split(":");
			int hourd = 0;
			int mind = 0;
			if (Atraso.equals(" ")) {
				continue;
			} else {
				mind = Integer.parseInt(delay[1]);
				hourd = Integer.parseInt(delay[0]);
				int ss = (hourd*60*60)+(mind*60);
				count+=1;
			}*/
		}
		

	}

}
