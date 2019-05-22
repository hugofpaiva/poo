package aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Voo {
	private String Hora, Voo, Origem, Atraso;

	public Voo(String hora, String voo, String origem, String atraso) {
		this.Hora = hora;
		this.Voo = voo;
		this.Origem = origem;
		this.Atraso = atraso;
	}

	public String getCompanhia() {
		String Companhia = "";
		char[] companhia = this.Voo.toCharArray();
		for (int x = 0; x <= 1; x++) {
			Companhia += companhia[x];
		}
		try {
			Scanner inputc = new Scanner(new File("companhias.txt"));
			while (inputc.hasNextLine()) {
				String line = inputc.nextLine();
				String[] Companhiastemp = line.split("\t");
				if (Companhiastemp[0].equals(Companhia)) {
					return Companhiastemp[1];
				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("O ficheiro não foi encontrado.");

		}
		return "";

	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public String getVoo() {
		return Voo;
	}

	public void setVoo(String voo) {
		Voo = voo;
	}

	public String getOrigem() {
		return Origem;
	}

	public void setOrigem(String origem) {
		Origem = origem;
	}

	public String getAtraso() {
		return Atraso;
	}

	public void setAtraso(String atraso) {
		Atraso = atraso;
	}

	@Override
	public String toString() {
		String x = "";
		if (!this.Atraso.equals(" ")) {
			int hourd = 0;
			int mind = 0;
			if (!this.Hora.equals("Hora")) {
				String[] hours = this.Hora.split(":");
				String[] delay = this.Atraso.split(":");
				int minh = Integer.parseInt(hours[1]);
				if (this.Atraso.equals(" ")) {
					mind = 0;
					hourd = 0;
				} else {
					mind = Integer.parseInt(delay[1]);
					hourd = Integer.parseInt(delay[0]);
				}
				int min;
				int hour = 0;
				if (mind + minh >= 60) {
					hour += 1;
					min = mind + minh - 60;

				} else {
					min = mind + minh;

				}
				hour += hourd;
				hour += Integer.parseInt(hours[0]);
				String d = String.valueOf(hour);
				String f = String.valueOf(min);
				if (min < 10) {
					f = "0" + f;
				}
				if (hour < 10) {
					d = "0" + d;
				}
				x = "Previsto: " + d + ":" + f;
			} else {
				x = "Obs";
			}
		}
		return String.format("%-7s%-8s%-20s%-22s%-8s%s", this.Hora, this.Voo, this.getCompanhia(), this.Origem,this.Atraso, x);
	}

	public Voo(String hora, String voo, String origem) {
		super();
		Hora = hora;
		Voo = voo;
		Origem = origem;
		Atraso = " ";
	}

}
