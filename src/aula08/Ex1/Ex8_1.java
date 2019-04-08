package aula08.Ex1;

import java.util.ArrayList;

public class Ex8_1 {
	
	public static void main(String[] args) {
		Automovel_ligeiro BMW_i8 = new Automovel_ligeiro("AA-BB-99", "BMW", "i8", 410, "BQWBFKHS2345HKV", 5.4);
		Pesado_P camioneta = new Pesado_P("77-GB-9G", "MAN", "StarShip", 350, "SGRD35V", 3500.5, 35);
		Motociclo Yamaha = new Motociclo("CC-88-DD", "Yamaha", "KW", 320, "Desportivo");
		ArrayList<Veiculo> carros = new ArrayList<Veiculo>();
		carros.add(BMW_i8);
		carros.add(camioneta);
		carros.add(Yamaha);
		
		Empresa agencia1 = new Empresa("AlugaCar", "9999-999", "geral@alugacar.org", carros);
		System.out.println(agencia1);
	}

}
