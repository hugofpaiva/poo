package aula04;

import java.util.Scanner;

public class Ex4_4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte vali = 0;
		int ano = 0;
		int mes = 0;
		int dias,dia = 0;
		String n;
		while(vali==0) {
			System.out.println("Qual a data? (../....) ");
			n = sc.nextLine();
			System.out.println("Qual o dia?");
			dia = sc.nextInt();
			if(n.matches("(\\d{1,2})/(\\d{4})")) {
				String[] data= n.split("/");
				ano= Integer.parseInt(data[1]);
				mes= Integer.parseInt(data[0]);
				if (ano>0 && mes>=1 && mes<12) {
					vali = 1;
					dias = day(mes, ano);
					imprimir_calendário(dias, dia, mes, ano);
					sc.close();
				}
				
			}
	}
}
	public static int day(int mes, int ano) {	
		int dia;
		switch (mes) {
				case 4:
				case 6:
				case 9:
				case 11:
					dia = 30;
				case 2:
					if(ano%4==0) {
						if(ano%100==0 && ano%400!=0) {
							dia = 28;
							break;
						}
						else {
							dia = 29;
							break;
						}
					}
					else {
						dia = 28;
						break;
					}
				default:
					dia = 31;
					break;
			}
		return dia;
	}
	
	 public static void imprimir_calendário(int dias, int inicio, int mes, int ano){
		 switch (mes) {
			case 1:
				System.out.printf("    %s \n", "January "+ano);
				break;
			case 2:
				System.out.printf("    %s \n", "February "+ano);
				break;
			case 3:
				System.out.printf("    %s \n", "March "+ano);
				break;
			case 4:
				System.out.printf("    %s \n", "April "+ano);
				break;
			case 5:
				System.out.printf("    %s \n", "May "+ano);
				break;
			case 6:
				System.out.printf("    %s \n", "June "+ano);
				break;
			case 7:
				System.out.printf("    %s \n", "July "+ano);
				break;
			case 8:
				System.out.printf("    %s \n", "August "+ano);
				break;
			case 9:
				System.out.printf("    %s \n", "September "+ano);
				break;
			case 10:
				System.out.printf("    %s \n", "October "+ano);
				break;
			case 11:
				System.out.printf("    %s \n", "November "+ano);
				break;
			case 12:
				System.out.printf("    %s \n", "December "+ano);
				break;
				
				
}
		 System.out.println(" Mo Tu We Th Fr Sa Su ");
	    
	    for (int i = 0; i < inicio - 1; i++) {
	      System.out.printf("%3s", new Object[] { " " });
	    }
	    
	    for (int j = 1; j <= dias; j++) {
	      System.out.printf("%3d", new Object[] { Integer.valueOf(j) });
	      
	      if (((j + inicio - 1) % 7 == 0) || (j == dias)) {
	        System.out.println();
	      }
	    }
	  }
	
}
