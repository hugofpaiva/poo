package aula03;
import java.util.Scanner;

public class Ex3_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double max=Double.NEGATIVE_INFINITY;
		double min= Double.POSITIVE_INFINITY;
		double n;
		double i=1;
		System.out.print("Número? ");
		double primeiro= sc.nextDouble();
		n=primeiro-1;
		double total=primeiro;
		double media=0;
		while(primeiro!=n) {
			System.out.print("Número? ");
			n=sc.nextDouble();
			if(max<n) {
				max=n;
			}
			if(min>n) {
				min=n;
			}
			if(primeiro!=n) {
				total+=n;
				i+=1;
			}

		};
		media = total/i;
		System.out.printf("Máx: %.2f Min: %.2f Média: %.2f",max,min,media);
		sc.close();
		
		
		
	}

}
