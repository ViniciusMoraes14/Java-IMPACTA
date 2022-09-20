package Lista_EX;
import java.util.Scanner;

public class Exercicio_04 {
	
	public static void main(String[] args) {
		int qtd_p1,qtd_p2;
		double valor_p1,valor_p2,IPI,valor_total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade da peça 1: ");
		qtd_p1 = sc.nextInt();
		System.out.print("Digite o valor da peça 1: ");
		valor_p1 = sc.nextFloat();
		System.out.println("-------------------------------------------");
		System.out.print("Digite a quantidade da peça 2: ");
		qtd_p2 = sc.nextInt();
		System.out.print("Digite o valor da peça 2: ");
		valor_p2 = sc.nextFloat();
		
		IPI = ((valor_p1*qtd_p1) + (valor_p2*qtd_p2)) / 100 + 1;
		valor_total = (valor_p1*qtd_p1 + valor_p2*qtd_p2)*IPI ;
		
		System.out.println("O Total da compra é de R$"+valor_total);
	}
}
