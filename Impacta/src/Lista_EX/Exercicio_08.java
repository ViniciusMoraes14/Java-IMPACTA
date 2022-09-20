package Lista_EX;
import java.util.*;
public class Exercicio_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		
		if(idade < 16) {
			System.out.println("Você ainda não pode votar esse ano!");
		}
		else {
			System.out.println("Você pode votar esse ano!");
		}

	}

}
