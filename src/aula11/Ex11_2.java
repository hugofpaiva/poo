package aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_2 {

	public static void main(String[] args) {
		ArrayList<String> Voos = new ArrayList<String>();
		ArrayList<String> Companhias = new ArrayList<String>();
		ArrayList<Voo> voos = new ArrayList<Voo>();
		try {
			Scanner inputv = new Scanner(new File("voos.txt"));
			Scanner inputc = new Scanner(new File("companhias.txt"));
			int l = 0;
			String tempor = inputv.nextLine();
			while (inputv.hasNextLine()) {
				String line = inputv.nextLine();
				String[] Voostemp = line.split("\t");
				if(Voostemp.length==4) {
					voos.add(new Voo(Voostemp[0],Voostemp[1],Voostemp[2],Voostemp[3]));
					
				}
				else {
					voos.add(new Voo(Voostemp[0],Voostemp[1],Voostemp[2]));
				}
				
				//String[] Voostemp = line.split("\t");
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

		} catch (FileNotFoundException e) {
			System.out.println("O ficheiro não foi encontrado.");
		}
		for(Voo i: voos) {
			System.out.println(i);
		}

	}

}
