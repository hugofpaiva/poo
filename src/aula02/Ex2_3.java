package aula02;

import java.util.Scanner;

public class Ex2_3 {
	public static void main(String[] args) {
		double M, Ti, Tf, Q;
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual a quantidade de água em quilogramas? ");
		M = sc.nextDouble();
		System.out.print("Qual a temperatura inicial? ");
		Ti = sc.nextDouble();
		System.out.print("Qual a temperatura final? ");
		Tf = sc.nextDouble();
		Q = M*(Tf-Ti)*4184;
		System.out.print("A energia necessária é: "+Q);
		sc.close();
	}

}
