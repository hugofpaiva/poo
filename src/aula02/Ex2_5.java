package aula02;
import java.util.Scanner;

public class Ex2_5 {
	public static void main(String[] args) {
		double v1, v2, vmf;
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual a v1? ");
		v1 = sc.nextDouble();
		System.out.print("Qual a v2? ");
		v2 = sc.nextDouble();
		//vm = (d+d/deltat1+deltat2)
		vmf = (2*v1*v2)/(v1+v2);
		System.out.print("A velocidade média final é: "+vmf);
		sc.close();
	}
	

}
