package java_sexta_4;
import java.util.*;
public class exemplo_metodo_3 {
	public static void CalculoImc(float peso, float altura){

		float imc;
		imc=(peso)/(altura*altura);
		System.out.println(imc);
		if (imc <20) {
			System.out.println("Pessoa não obesa");
		}
		if(imc >20 && imc <25) {
			System.out.println("Pessoa obesa moderada");
		}
		if(imc>25) {
			System.out.println("Pessoa obesa com risco");
		}
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int count = 0;
		
		while(count<5) {
			System.out.print("Nome: ");
			sc.next();
			System.out.print("Digite a altura: ");
			float alt = sc.nextFloat();
			System.out.print("Digite o peso: ");
			float peso = sc.nextFloat();
			System.out.println("");
			CalculoImc(peso,alt);
			count++;
			System.out.println("");
		}

	}

}
