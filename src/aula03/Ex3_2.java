package aula03;
import java.util.Scanner;

public class Ex3_2 {
	
	public static void main(String[] args) {
		int n = val();
		
		while(n>=0) {
			if (n==0) {
				System.out.println("0");
				return;
			}
			else {
				System.out.println(n);
				n = n-1;
			}
				
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
				vali = 1;
				sc.close();
				
			}
	}
		return num;

}
	
}
