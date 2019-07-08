package EP_16_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RoboCopa {
	public static void main(String[] args) {
		RoboCopa exam = new RoboCopa();
		exam.parte1();
		exam.parte2();
	}

	private void parte1() {

		Bola bola = null;
		bola = new Bola(CorDaBola.Amarela);
		showOMStatus(bola);

		Equipa e1 = new Equipa("BeiraMar", "JJ");
		Robo r[] = { new Robo("Ron", TipoJogador.GuardaRedes, 5, 0), new Robo("Mes", TipoJogador.Avancado, 2, 40),
				new Robo("Pau", TipoJogador.Defesa, 7, 10), new Robo("Ema", TipoJogador.Medio, 5, 25),
				new Robo("Tim", TipoJogador.Medio, 1, 20) };
		for (ObjetoMovel o : r)
			showOMStatus(o);

		e1.add(r[0]);
		e1.add(r[1]);
		e1.add(r[2]);
		e1.add(r[1]);
		e1.add(r[3]);
		e1.add(r[4]);
		e1.remove(r[3]);
		System.out.print("-- " + e1);

		Equipa e2 = new Equipa("PortoDAveiro", "Lopes");
		e2.add(new Robo("Liu", TipoJogador.GuardaRedes, 5, 80));
		e2.add(new Robo("Min", TipoJogador.Avancado, 3, 10));
		e2.add(new Robo("Hus", TipoJogador.Defesa, 6, 70));
		e2.add(new Robo("Taw", TipoJogador.Medio, 5, 65));
		e2.add(new Robo("Taw", TipoJogador.Medio, 5, 65));
		System.out.print("-- " + e2);

		if (Bola.getnBolas() == 0)
			bola = new Bola(CorDaBola.Azul);
		else
			System.out.println("Já temos bola!");

		Jogo tacoataco = new Jogo(e1, e2, bola, 20);
		System.out.println("--- " + tacoataco);

		// simulação simples de movimentos e golos de uma equipa
		Robo[] r2 = e2.getRobos();
		r2[1].marcaGolo();
		r2[1].move(40, 40);
		r2[1].move(60, 40);
		r2[1].move(70, 40);
		r2[1].marcaGolo();
		r2[2].move(55, 55, 20);
		r2[3].move(40, 20);
		r2[3].move(60, 20);
		r2[3].move(70, 20);
		r2[3].marcaGolo();
		for (Robo rob : r)
			showRoboStatus(rob);

		System.out.println("Score: " + e1.getGolosMarcados() + " - " + e2.getGolosMarcados());
	}

	private void showOMStatus(ObjetoMovel om) {
		System.out.printf("OM: %3d %3d %3.0f %5.1f\n", om.getX(), om.getY(), om.getVelocidade(), om.getDistancia());
	}

	private void showRoboStatus(Robo rob) {
		System.out.printf("%-10s %-15s %3d %3d %3.0f %5.1f %3d\n", rob.getId(), rob.getTipo(), rob.getX(), rob.getY(),
				rob.getVelocidade(), rob.getDistancia(), rob.getGolos());
	}

	private void parte2() {
		ArrayList<Robo> robos = new ArrayList<>();
		ArrayList<Equipa> equipas = new ArrayList<>();
		
		Set<String> eq = new HashSet<>();
		int x = 0;
		try {
			Scanner read = new Scanner(new File("robos.txt"));
			String init = read.nextLine();
			String[] arrayinit = init.split("\t");
			while (read.hasNextLine()) {
				String line = read.nextLine();
				String[] palavras = line.split("\t");
				robos.add(new Robo(palavras[0], palavras[1], palavras[2]));
				x=robos.size();
				eq.add(palavras[1]);
			}
			for(String l : eq) {
				
				equipas.add(new Equipa(l,"unknown"));
				
			}
			for(Robo i: robos) {
				for(Equipa m: equipas) {
					if(i.getEquipa().equals(m.getNome())) {
						m.add(i);
					}
				}
			}
			for(Equipa m: equipas) {
				System.out.print(m.mostras());
			}
			/*
			 * for (Robo i : robos) { System.out.println(i.mostrar()); }
			 */

			// Print desta merda toda

			System.out.print("Lista de equipas (" + eq.size() + " equipas)");
		} catch (FileNotFoundException e) {
			System.out.println("O ficheiro robos.txt não foi encontrado.");
		}
	}

}
