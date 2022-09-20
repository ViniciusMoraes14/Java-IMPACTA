package Lista_EX;
import java.util.*;
public class Exercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtd_fruta;
		
		System.out.print("Digite a quantidade de Maçãs: ");
		qtd_fruta = sc.nextInt();
		
		if(qtd_fruta < 12) {
			double valor = 0.30;
			System.out.println("O valor total é R$" + qtd_fruta * valor);
		}
		else {
			double valor = 0.25;
			System.out.println("O valor total é R$" + qtd_fruta * valor);
		}

	}

}
