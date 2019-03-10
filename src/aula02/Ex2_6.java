package aula02;
import java.util.Scanner;

public class Ex2_6 {
	public static void main(String[] args) {
		int ss,mm,hh;
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o tempo em segundos? ");
		ss = sc.nextInt();
		hh = ss/3600;
		ss = ss%3600;
		mm = ss/60;
		ss = ss%60;
		System.out.printf("O tempo é: %02d:%02d:%02d ", hh, mm, ss);
		sc.close();
		
		
	}

}
