package aula03;
import java.util.Random;
import java.util.Scanner;

public class Ex3_7 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran= new Random();
		int adivinha= ran.nextInt(100);
		String cont="s";
		int tentativa;
		int ntentativas = 0;
		while(cont.equals("s")) {
			tentativa = val();
			if(tentativa<adivinha) {
				System.out.println("Demasiado baixo");
			}
			else if (tentativa>adivinha) {
				System.out.println("Demasiado alto");
			}
			else {
				System.out.println("Acertou!");
				break;
			}
			ntentativas++;
			System.out.print("Continuar? (s/n) ");
			cont=scn.next();
			
		}
		scn.close();
	}
	
	
	
	
	
	public static int val() {
		Scanner sc = new Scanner(System.in);
		byte vali = 0;
		int num = 0;
		String n;
		while(vali==0) {
			System.out.print("Qual o número? ");
			n = sc.nextLine();
			if(n.matches("\\d+")) {
				num=Integer.parseInt(n);
				if(num>=0 && num<100) {
					vali = 1;
				}
				
			}
	}
		return num;

}

}
