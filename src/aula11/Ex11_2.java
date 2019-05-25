package aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

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
		// Tabela lista de Voos e média de Atrasos
		HashMap<String, List<Integer>> companhias = new HashMap<>();
		TreeMap<String, Integer> companhiasm = new TreeMap<>();
		HashMap<String, String> companhiasmtemp = new HashMap<>();
		for (Voo i : voos) {
			List<Integer> time = new ArrayList<>();
			System.out.println(i);
			String companhia = i.getCompanhia();
			String Atraso = i.getAtraso();
			String[] delay = Atraso.split(":");
			int hourd = 0;
			int mind = 0;
			if (Atraso.equals("Atraso") || Atraso.equals(" ")) {
				continue;
			} else {
				mind = Integer.parseInt(delay[1]);
				hourd = Integer.parseInt(delay[0]);
				Integer ss = (hourd * 60 * 60) + (mind * 60);
				if (companhias.containsKey(companhia)) {
					time = companhias.get(companhia);
					time.add(ss);
					companhias.put(companhia, time);
				} else {
					time.add(ss);
					companhias.put(companhia, time);
				}
			}
		}
		for (String l : companhias.keySet()) {
			int total = 0;
			for (int x : companhias.get(l)) {
				total += x;
			}
			int media = total / companhias.get(l).size();
			int min = (media / 60) % 60;
			int hour = (media / 60) / 60;
			companhiasm.put(l, media);

		}
		Map<String, Integer> companhiasm1 = sortByComparator(companhiasm, "asc");
		System.out.printf("%-20s%-12s\n", "Companhia", "Atraso Médio");
		for (String m : companhiasm1.keySet()) {
			int min = (companhiasm1.get(m) / 60) % 60;
			int hour = (companhiasm1.get(m) / 60) / 60;
			String smin = String.valueOf(min);
			String shour = String.valueOf(hour);
			if (min < 10) {
				smin = "0" + smin;
			}
			if (hour < 10) {
				shour = "0" + shour;
			}
			String times = shour + ":" + smin;
			companhiasmtemp.put(m, times);
			System.out.printf("%-20s%-12s\n", m, times);

		}
		city(voos);

	}

	private static void city(ArrayList<Voo> vv) {
		Map<String, Integer> Origens = new HashMap<>();
		Map<String, Integer> Origensm = new HashMap<>();
		int times = 0;
		for (Voo i : vv) {
			String Origem = i.getOrigem();

			if (Origem.equals("Origem") || Origem.equals(" ")) {
				continue;
			} else {
				if (Origens.containsKey(Origem)) {
					times = Origens.get(Origem);
					times += 1;
					Origens.put(Origem, times);
				} else {
					times = 1;
					Origens.put(Origem, times);
				}
			}
		}
		Origensm = sortByComparator(Origens, "desc");

		try {
			PrintWriter writer = new PrintWriter("cidades.txt");
			writer.printf("%-22s%-12s\n", "Origem", "Voos");
			for (String m : Origensm.keySet()) {
				writer.printf("%-22s%-12d\n", m, Origensm.get(m));
			}
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("O ficheiro não foi encontrado.");
		}

	}

	private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap, String order) {
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if (order.equals("asc"))
					return o1.getValue().compareTo(o2.getValue());
				else if (order.equals("desc"))
					return o2.getValue().compareTo(o1.getValue());
				else
					return 0;
			}
		});
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

}
