package aula02;
import java.lang.Math;
import java.util.Scanner;

public class Ex2_8 {
	public static void main(String[] args) {
		double cA, cB, hip, ang, sqrcA, sqrcB;
		Scanner sc = new Scanner(System.in);
		System.out.print("Cateto A? ");
		cA = sc.nextDouble();
		System.out.print("Cateto B? ");
		cB = sc.nextDouble();
		sqrcA = Math.pow(cA, 2);
		sqrcB = Math.pow(cB, 2);
		hip = Math.sqrt(sqrcA+sqrcB);
		ang = cB/hip;
		ang = Math.asin(ang)*180/Math.PI;
		System.out.printf("O valor da hipotenusa é: "+ "%.2f", hip);
		System.out.println();
		System.out.printf("O valor do ângulo entre o lado A e a hipotenusa é: %.2fº", ang);
		sc.close();
		
		
		
		
	}

}
