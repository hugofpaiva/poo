package aula03;
import java.util.Random;

public class Ex3_8 {
	public static void main(String[] args) {
		double[][] notas = new double[16][2];
		double T;
		double P;
		double F;
		Random ran = new Random();
		for (int i=0; i<notas.length;i++) {
			notas[i][0]=ran.nextDouble()*20;
			notas[i][1]=ran.nextDouble()*20;
		}
		System.out.printf("%10s %10s %10s \n","NotaT","Nota P","Pauta");
		for (int i=0; i<notas.length;i++) {
			T=notas[i][0];
			P=notas[i][1];
			if (T<7.0 || P<7.0) {
				F=66;
			}
			else {
				F=0.4*T+0.6*P;
			}
			System.out.printf("%10.2f %10.2f %10.0f \n", T, P, F);
		}
		
		
	}

}
