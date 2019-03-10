package aula03;
import java.util.Scanner;

public class Ex3_1 {
	
	public static double val(String message) {
		Scanner sc = new Scanner(System.in);
		double nota = -1;
		String notain;
		while(nota>20||nota<0) {
			System.out.print(message);
			notain = sc.nextLine();
			if(notain.matches("\\d+(\\.\\d+)?")) {
				nota=Double.parseDouble(notain) ;
			}
		}
		if(message=="Nota Teórica=") {
			sc.close();
		}
		return nota;
		
	}

	public static void main(String[] args) {
		double P=val("Nota Prática =");
		double T=val("Nota Teórica =");
		double F=0.4*T+0.6*P;
		if (T<7.0 || P<7.0) {
			System.out.println("Nota final = 66 ");
		}
		else {
			System.out.printf("Nota final = %.0f ", F);
		}
	}


}
