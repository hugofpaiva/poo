package aula03;
import java.util.Scanner;

public class Ex3_5 {
	
	
	
	public static int mval() {
		Scanner sc = new Scanner(System.in);
		byte vali = 0;
		int num = 0;
		String n;
		while(vali==0) {
			System.out.print("Qual o montante investido? ");
			n = sc.nextLine();
			if(n.matches("\\d+")) {
				num=Integer.parseInt(n);
				if (num>0 && num%1000==0) {
				vali = 1;
				}
				
			}
	}
		return num;

}
	public static double jval() {
		Scanner sc = new Scanner(System.in);
		byte vali = 0;
		double juro = 0;
		String j;
		while(vali==0) {
			System.out.print("Qual o Juro? ");
			j = sc.nextLine();
			if(j.matches("\\d+(\\.\\d+)?")) {
				juro=Double.parseDouble(j);
				if (juro>0 && juro<5) {
					vali = 1;
					sc.close();
				}
				
			}
	}
		return juro;
	}
	
	public static void main(String[] args) {
		double montante = mval();
		double juro = jval();
		for (int i=1;i<13; i++)
		{
			montante+= montante*(juro/100);
			System.out.printf("Mês: %d Montante acumulado: %.2f %n", i, montante);
			
		}
		
	}

}
