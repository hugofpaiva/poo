package aula05;

import java.util.Scanner;

public class Ex5_1 {
	public static void main(String[] args) {
		int x1, x2, y1, y2, r1, r2, comprimentoR, alturaR, t1, t2, t3;
		double perimetroT1;
		Scanner sc = new Scanner(System.in);
		System.out.println("x do ponto 1");
		x1 = sc.nextInt();
		System.out.println("y do ponto 1");
		y1 = sc.nextInt();
		System.out.println("x do ponto 2");
		x2 = sc.nextInt();
		System.out.println("y do ponto 2");
		y2 = sc.nextInt();
		Ponto p1 = new Ponto(x1, y1);
		Ponto p2 = new Ponto(x2, y2);

		System.out.println("Raio do circulo 1");
		r1 = sc.nextInt();
		System.out.println("Raio do circulo 2");
		r2 = sc.nextInt();
		Circulo c1 = new Circulo(r1, p1);
		Circulo c2 = new Circulo(r2, p2);
		System.out.println("Verificação se Circulo 1 interseta Circulo2:");
		System.out.println(c1.inter(c2));
		System.out.println("Área do Circulo 1:");
		System.out.println(c1.area());
		System.out.println("Perímetro do Circulo 1:");
		System.out.println(c1.perimetro());
		System.out.println("Área do Circulo 2:");
		System.out.println(c2.area());
		System.out.println("Perímetro do Circulo 2:");
		System.out.println(c2.perimetro());
		
		System.out.println("Comprimento do Retângulo");
		comprimentoR = sc.nextInt();
		System.out.println("Altura do Retângulo");
		alturaR = sc.nextInt();
		Retangulo R1 = new Retangulo(comprimentoR, alturaR);
		System.out.println("Área do Retangulo:");
		System.out.println(R1.area());
		System.out.println("Perímetro do Retangulo:");
		System.out.println(R1.perimetro());
		System.out.println("Nova altura do Retangulo:");
		alturaR = sc.nextInt();
		R1.setaltura(alturaR);
		System.out.println("Nova área do Retangulo:");
		System.out.println(R1.area());
		System.out.println("Novo perímetro do Retangulo:");
		System.out.println(R1.perimetro());
		
		System.out.println("Lado 1 do Triângulo");
		t1 = sc.nextInt();
		System.out.println("Lado 2 do Triângulo");
		t2 = sc.nextInt();
		System.out.println("Lado 3 do Triângulo");
		t3 = sc.nextInt();
		Triangulo T1 = new Triangulo(t1, t2, t3);
		System.out.println("Perímetro do Triângulo:");
		System.out.println(T1.perimetro());
		perimetroT1 = T1.perimetro();
		System.out.println("Área do Triângulo:");
		System.out.println(T1.area(perimetroT1));
		
		

	}

}
