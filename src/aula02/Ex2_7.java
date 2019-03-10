package aula02;
import java.util.Scanner;
import java.lang.Math;

public class Ex2_7 {
	public static void main(String[] args) {
		double p1x,p1y,p2x,p2y, d, sqrx, sqry;
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual a abcissa de p1? ");
		p1x = sc.nextDouble();
		System.out.print("Qual a ordenada de p1? ");
		p1y = sc.nextDouble();
		System.out.print("Qual a abcissa de p2? ");
		p2x = sc.nextDouble();
		System.out.print("Qual a ordenada de p2? ");
		p2y = sc.nextDouble();
		sqrx = Math.pow((p1x-p2x),2);
		sqry = Math.pow((p1y-p2y),2);
		d = Math.sqrt((sqrx)+(sqry));
		System.out.print("A distância é: "+d);
		sc.close();
	}

}
