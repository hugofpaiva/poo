package aula02;
import java.util.Scanner;

public class Ex2_4 {
	public static void main(String[] args) {
		double M, Tj;
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o montante investido? ");
		M = sc.nextDouble();
		System.out.print("Qual a taxa de juro mensal? ");
		Tj = sc.nextDouble();
		for (int l=1; l<=3; l++) {
			M= M*(Tj/100)+M;
		}
		System.out.print("No final dá: "+M);
		sc.close();
		
		
		
	}
	
}
