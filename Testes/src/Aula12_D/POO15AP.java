package Aula12_D;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class POO15AP {
	public static void main(String[] args) {
		POO15AP ap = new POO15AP();
		ap.alinea1(); // ap.alinea2(); // ap.alinea3();
	}

	public void alinea1() {
		System.out.println("\nA1)");
		LojaAlimentar lZe = new LojaAlimentar("Loja do Zé", "Rua Domingos Carrancho, 15, 3800-145 Aveiro");
		Lacteo lact1 = new Lacteo("Iogurte Natural Danone", 1.48, 56, "07.06.2015");
		// nome, preço, calorias, validade
		lact1.setGordura(4.0);
		lact1.setTemp(4, 6); // temperaturas mínima e máxima lZe.add(lact1);
		lZe.add(new Lacteo("Leite UHT Meio Gordo Mimosa", 0.64, 46, "20.06.2015", 1.7));
		// o último valor é a gordura
		Cereal c1 = new Cereal("Nestlé Fitness", 1.59, 200, "15.09.2015");
		c1.setComp(TIPO_CEREAL.ARROZ_TRIGO);
		lZe.add(c1);
		lZe.add(new Refrigerante("Cola Cola", 1.12, 300, "15.09.2015"));
		System.out.println(lZe); // imprime todos os produtos da loja
		try {
			PrintWriter fl = new PrintWriter(new File("output3.txt"));
			fl.println(lZe);
			fl.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
