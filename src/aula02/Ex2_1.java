package aula02;
import java.util.Scanner;

public class Ex2_1 {
	public static void main(String[] args) {
		double km, miles;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a distância em km: ");
		km = sc.nextDouble();
		miles = km/ 1.609;
		System.out.print("A distância em milhas é "+miles);
		sc.close();
	}

}
