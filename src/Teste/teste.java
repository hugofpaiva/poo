package Teste;

public class teste {
	public static void main(String[] args) {
		int x,y;
		double z;
		x=5;
		y = x++;
		System.out.println(y);
		System.out.println(x);
		y = ++x;
		System.out.println(y);
		System.out.println(x);
		System.out.println(y/3);
		System.out.println(y%3);
		z=12.0/y;
		boolean sim = 5>5;
		System.out.println(sim);
		double muitos[] = new double[5];
		System.out.println(muitos[1]);		
		
		char code = 'F';
		boolean c = (code >= 'M') && (code <= 'Z');
		System.out.println(c);

	}
}
