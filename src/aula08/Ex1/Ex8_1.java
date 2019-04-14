package aula08.Ex1;

public class Ex8_1 {
	
	
	static Empresa agencia1;
	
	public static void main(String[] args) {
		Automovel_ligeiro bmw = new Automovel_ligeiro("00-AA-00", "BMW", "i8", 410, "BQWBFKHS2345HKV", 5);
		Pesado_P camioneta = new Pesado_P("Q9-CC-89", "MAN", "StarShip", 350, "SGRD35V", 3500, 35);
		Motociclo moto = new Motociclo("23-HH-23", "HONDA", "CBF", 1000, "Desportivo");
		
		// Alinea a
		agencia1 = new Empresa("Rent-a-Car", "geral@rentacar.pt","3800-202");
		agencia1.add(bmw);
		agencia1.add(camioneta);
		agencia1.add(moto);
		
		System.out.println(agencia1);
		
		
		// Alinea b
		bmw.trajeto(230);
		moto.trajeto(6);
		camioneta.trajeto(45);
		bmw.trajeto(29);
		
		System.out.println("\nDistância total");
		System.out.printf("BMW: %d km\n", bmw.distanciaTotal());
		System.out.printf("Honda: %d km\n", moto.distanciaTotal());
		System.out.printf("Camioneta: %d km\n", camioneta.distanciaTotal());
		
		System.out.println("\nÚltimo trajeto");
		System.out.printf("BMW: %d km\n", bmw.ultimoTrajeto());
		System.out.printf("Honda: %d km\n", moto.ultimoTrajeto());
		System.out.printf("Camioneta: %d km\n", camioneta.ultimoTrajeto());
	
		// Alinea c
		System.out.println("\nViatura com maior número de km percorridos:");
		System.out.println(getMaiorKm());
		
		
		
	}

	private static Veiculo getMaiorKm() {
		int maior=0;
		Veiculo v_maior = null;
		for(Veiculo v : agencia1.viaturas) {
			if(v.distanciaTotal()>maior) {
				maior=v.distanciaTotal();
				v_maior=v;
			}
		}
			
		return v_maior;
		
		
	}

}
