package aula07;

import java.util.Scanner;

public class Ex7_1 {
	public static void main(String[] args) {
		int n,neq,tipo;
		double x,y,vmaxi;
		String tipotemp = "";
		Scanner sc = new Scanner(System.in);
		//definir o tempo inicial
		Tempo ti = new Tempo();
		do {
			System.out.println("0 - Sair");//Calcular dist. percorrida pela bola e sair
			System.out.println("1 - Criar equipas");
			System.out.println("2 - Personalizar bola");
			System.out.println("3 - Mover jogador");
			n = sc.nextInt();
			
			
		}while(n==0);
		
		switch(n){
			
		
			case 0:
				System.exit(0);
			case 1:
				do {
				System.out.println("Acrecentar a que equipa(1/2)?");
				neq=sc.nextInt();
				}while(neq!=1 || neq!=2);
				if(neq==1) {
					System.out.println("Posição(x) do jogador?");
					x = sc.nextDouble();
					System.out.println("Posição(y) do jogador?");
					y = sc.nextDouble();
					System.out.println("Vmax do jogador?");
					vmaxi = sc.nextDouble();
					System.out.println("Tipos de Jogadores:");
					System.out.println("1 - GR");
					System.out.println("2 - Avançado");
					System.out.println("3 - Defesa");
					System.out.println("4 - Médio");
					do {System.out.println("Que tipo?");
					tipo = sc.nextInt();
					}while(tipo!=1 || tipo!=2 || tipo!=3 || tipo!=4 );
					switch(tipo) {
					case 1: tipotemp = "GuardaRedes";
					case 2: tipotemp = "Avancado";
					case 3: tipotemp = "Defesa";
					case 4: tipotemp = "Medio";
					}
					Robo t1 = new Robo(x,y,vmaxi,tipotemp);
				}
				
		}
	}
		
	

}
