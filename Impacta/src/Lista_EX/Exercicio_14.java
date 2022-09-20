package Lista_EX;
import java.util.*;
public class Exercicio_14 {

	public static void main(String[] args) {
		int lados;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos lados tem o polígono: ");
		lados = sc.nextInt();
		
		if(lados < 3) {
			System.out.println("NÃO É UM POLÍGONO!");
		}
		if(lados > 5) {
			System.out.println("POLÍGONO NÃO IDENTIFICADO!");
		}
		if (lados >=3 && lados <=5) {
			System.out.println("É UM POLÍGONO!");
		}

		
	}
	

}
