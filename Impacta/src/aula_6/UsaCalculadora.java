package aula_6;

import java.util.*;

public class UsaCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		c1.setA(sc.nextInt());
		
		System.out.println("Digite o segundo valor");
		c1.setB(sc.nextInt());
		
		System.out.println("Escolha uma operação");
		System.out.println("1 - soma");
		System.out.println("2 - sub");
		System.out.println("3 - mult");
		System.out.println("4 - Divide");
		c1.setOp(sc.nextInt());
		
		c1.calcular(c1.getA(), c1.getB(), c1.getOp());
		
		c1.calcular(23,67,3);
		

	}

}