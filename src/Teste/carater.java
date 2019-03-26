package Teste;

public class carater {
	
	public static void main(String[] args) {
		String x = "Zé é Zeca";
		System.out.println(check(x));
	}
	
	public static int check(String x) {
		int count = 0;
		for (int i=0; i<x.length();i++) {
			char c = x.charAt(i);
			if(c=='Z') {
				count+=1;
			}
		}
		return count;
	}
}
