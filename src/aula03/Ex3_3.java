package aula03;
import java.util.Scanner;

public class Ex3_3 {

	public static void main(String[] args) {
		int n = val();
		boolean Prime = true;
		int i =2;
		while(Prime && i<=n/2) {
			if(n%i==0) {
				Prime=false;
			}
			i++;
		}
		if (Prime) {
			System.out.println("O número é primo!");
		}
		else {
			System.out.println("O número não é primo!");
		}
		
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
				if (num!=0) {
				vali = 1;
				sc.close();
				}
				
			}
	}
		return num;

}
}


