package aula02;
import java.util.Scanner;

public class Ex2_2 {
	public static void main(String[] args) {
		double C, F;
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual a temperatura em Célsius (C)? ");
		C = sc.nextDouble();
		F = 1.8 * C +32;
		System.out.print("A temperatura em Fahrenheit (F) é: "+F);
		sc.close();
		
		
	}
}
