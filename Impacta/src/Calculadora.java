import java.util.*;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,op;
		
		System.out.println("1-Soma");
		System.out.println("2-Subtrai");
		System.out.println("3-Multiplicação");
		System.out.println("4-Divisão");
		System.out.println("Escolha uma opção:");
		op = sc.nextInt();
		
		
		System.out.println("Digite o primeiro numero");
		a = sc.nextInt();
		System.out.println("Digite o segundo numero");
		b = sc.nextInt();
		
		switch(op) {
		
		case 1: System.out.println("Soma = " + (a+b));
				break;
		case 2: System.out.println("Subtração = " + (a-b));
				break;
		case 3: System.out.println("Multiplicação = " + (a*b));
				break;
		case 4: System.out.println("divisão = " + (a/b));
				break;
				
		default: System.out.println("Opção incorreta!");
		
		}
		
	}
	

}
