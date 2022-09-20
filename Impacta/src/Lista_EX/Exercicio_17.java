package Lista_EX;
import java.util.*;
public class Exercicio_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lados;
		
		System.out.print("Digite a quantidade de lados: ");
		lados = sc.nextInt();

		int n = 0;
		while (n<lados) {
			for (int i = 0; i < lados; i++) {
			    System.out.print("*");  
			}
			System.out.println("");  
			n++; 
		}
	}

}
