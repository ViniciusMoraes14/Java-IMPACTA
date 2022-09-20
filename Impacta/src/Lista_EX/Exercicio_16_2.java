package Lista_EX;

import java.util.Scanner;

public class Exercicio_16_2 {

	public static void main(String[] args) {
		int l1,l2,l3,soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro angulo: ");
		l1 = sc.nextInt();
		System.out.print("Digite o segundo angulo: ");
		l2 = sc.nextInt();
		System.out.print("Digite o terceiro angulo: ");
		l3 = sc.nextInt();
		soma = l1+l2+l3;
		
		System.out.println("-----------------------------------------------------------");
		if(soma == 90) {
			System.out.println("Triângulo Retângulo");
		}
		if(soma > 90) {
			System.out.println("Triângulo Obtusângulo");
		}
		if(soma < 90) {
			System.out.println("Triângulo Acutângulo");
		}
		

	}

}
