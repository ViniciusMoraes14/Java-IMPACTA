package Lista_EX;
import java.util.*;
public class Exercicio_16_1 {

	public static void main(String[] args) {
		int l1,l2,l3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a medida do lado 1: ");
		l1 = sc.nextInt();
		System.out.print("Digite a medida do lado 2: ");
		l2 = sc.nextInt();
		System.out.print("Digite a medida do lado 3: ");
		l3 = sc.nextInt();
		
		if(l1 == l2) {
			if(l2 == l3) {
				System.out.println("É EQUILATERO!");
			}
		}
		if(l1 != l2) {
			if(l2 == l3) {
				System.out.println("É ISÓSCELES!");
			}
		}
		if(l1 == l3) {
			if(l1 != l2) {
				System.out.println("É ISÓSCELES!");
			}
		}
		if(l1 == l2) {
			if(l1 != l3) {
				System.out.println("É ISÓSCELES!");
			}
		}
		if(l1 != l2) {
			if(l1 != l3) {
				if(l2 != l3) {
					System.out.println("É ESCALENO!");
				}
			}
		}
	}

}