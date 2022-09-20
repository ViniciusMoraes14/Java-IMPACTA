package Lista_EX;
import java.util.*;

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esse programa calcula o peso ideal!\nDigite 1 - Se você for do sexo feminino \nDigite 2 - Se você for do sexo masculino");
		System.out.print("Digite o número da opção: ");
		int opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.println("Ok você é do sexo feminino vamos calcular!\nDigite seu peso e sua altura utilizando a virgula!!!");
			
			System.out.print("Digite seu peso: ");
			double peso_f = sc.nextDouble();
			
			System.out.print("Digite sua altura: ");
			double altura_f = sc.nextDouble();
			
			double calculo_f = (peso_f * altura_f) - 58 ;
			
			System.out.println("Seu peso ideal é "+calculo_f);
		}
		
		if(opcao == 2) {
			System.out.println("Ok você é do sexo masculino vamos calcular!\nDigite seu peso e sua altura utilizando a virgula!!!");
			
			System.out.print("Digite seu peso: ");
			double peso_m = sc.nextDouble();
			
			System.out.print("Digite sua altura: ");
			double altura_m = sc.nextDouble();
			
			double calculo_m = (peso_m * altura_m) - 44 ;
			
			System.out.println("Seu peso ideal é "+calculo_m);
		
		}
		

	}

}
