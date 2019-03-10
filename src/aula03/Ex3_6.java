package aula03;
import java.util.Scanner;

public class Ex3_6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte vali = 0;
		int ano = 0;
		int mes = 0;
		String n;
		while(vali==0) {
			System.out.print("Qual a data? (../....) ");
			n = sc.nextLine();
			if(n.matches("(\\d{1,2})/(\\d{4})")) {
				String[] data= n.split("/");
				ano= Integer.parseInt(data[1]);
				mes= Integer.parseInt(data[0]);
				if (ano>0 && mes>1 && mes<12) {
				vali = 1;
				sc.close();
				}
				
			}
	}
		switch (mes) {
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print("O mês tem 30 dias");
				break;
			case 2:
				if(ano%4==0) {
					if(ano%100==0 && ano%400!=0) {
						System.out.print("O mês tem 28 dias");
						break;
					}
					else {
						System.out.print("O mês tem 29 dias");
						break;
					}
				}
				else {
					System.out.print("O mês tem 28 dias");
					break;
				}
			default:
				System.out.print("O mês tem 31 dias");
				break;
		}
	}

}
